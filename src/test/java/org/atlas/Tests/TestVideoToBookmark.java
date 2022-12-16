package org.atlas.Tests;

import org.atlas.Steps.LoginPageSteps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Тест для видеозакладок")
public class TestVideoToBookmark extends BaseTest {

  private final LoginPageSteps loginSteps = new LoginPageSteps(this);

  @DisplayName("Добавление видео в закладки")
  @Tag("video_bookmark")
  @Test
  public void doTest() {
    StringBuilder href = new StringBuilder();
    StringBuilder href2 = new StringBuilder();
    loginSteps.loginIn(testBot)
              .goToVideo()
              .getHrefFirstVideo(href)
              .addVideoToBookmark()
              .goToBookmarks()
              .goToVideoBookmarks()
              .getHrefFirstVideo(href2);
    if (href2.toString().contains("live")) {
      href2 = new StringBuilder(href2.toString().replace("live", "video"));
    }
    Assertions.assertEquals(href.toString(), href2.toString(), "Не удалось добавить видео в закладки");
  }
}
