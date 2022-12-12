package org.atlas.Tests;

import org.atlas.Steps.LoginPageSteps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Тест для видеозакладок")
public class TestVideoToBookmark extends BaseTest {

  private final LoginPageSteps loginSteps = new LoginPageSteps(this);
/*  private final VideoPageSteps videoPageSteps = new VideoPageSteps(this);
  private final BookmarksPageSteps bookmarksPageSteps = new BookmarksPageSteps(this);
  private final FeedPageSteps feedPageSteps = new FeedPageSteps(this);*/

  @DisplayName("Добавление видео в заклади")
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
      String temp = href2.toString();
      temp = temp.replace("live", "video");
      href2 = new StringBuilder(temp);
    }
    Assertions.assertEquals(href.toString(), href2.toString(), "Не удалось добавить видео в закладки");
  }
}
