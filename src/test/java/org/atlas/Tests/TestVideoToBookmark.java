package org.atlas.Tests;

import org.atlas.Steps.BookmarksPageSteps;
import org.atlas.Steps.FeedPageSteps;
import org.atlas.Steps.LoginPageSteps;
import org.atlas.Steps.VideoPageSteps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Тест для видеозакладок")
public class TestVideoToBookmark extends BaseTest {

  private final LoginPageSteps loginSteps = new LoginPageSteps(this);
  private final VideoPageSteps videoPageSteps = new VideoPageSteps(this);
  private final BookmarksPageSteps bookmarksPageSteps = new BookmarksPageSteps(this);
  private final FeedPageSteps feedPageSteps = new FeedPageSteps(this);

  @DisplayName("Добавление видео в заклади")
  @Tag("video_bookmark")
  @Test
  public void doTest() {
    loginSteps.loginIn(testBot);
    feedPageSteps.goToVideo();
    String href = site.onVideoPage().videoTopList().firstVideo().getAttribute("href");
    videoPageSteps.addVideoToBookmark().goToBookmarks();
    String href2 = bookmarksPageSteps.goToVideoBookmarks().getHrefFirstVideo();
    if (href2.contains("live")) {
      href2 = href2.replace("live", "video");
    }
    Assertions.assertEquals(href, href2, "Не удалось добавить видео в закладки");
  }
}
