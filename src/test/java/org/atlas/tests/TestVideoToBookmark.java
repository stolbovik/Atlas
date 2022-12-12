package org.atlas.tests;

import org.atlas.pagesFiles.pageElements.Video;
import org.atlas.pagesFiles.pages.BookmarksPage;
import org.atlas.pagesFiles.pages.LoginPage;
import org.atlas.pagesFiles.pages.VideoPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

@DisplayName("Тест для видеозакладок")
public class TestVideoToBookmark extends BaseTest {
  @DisplayName("Добавление видео в заклади")
  @Tag("video_bookmark")
  @Test
  public void someTest() {
    LoginPage loginPage = site.onLoginPage();
    loginPage.input("st.email"). sendKeys("technoPol4");
    loginPage.input("st.password").sendKeys("technoPolis2022");
    loginPage.button("login-form-actions").click();
    site.onLentaPage().toolbar().actionLink("Видео").click();
    VideoPage videoPage = site.onVideoPage();
    Video video = videoPage.videoTopList().firstVideo();
    String href = video.getAttribute("href");
    Actions action = new Actions(driver);
    action.moveToElement(video).perform();
    video.videoMenu().click();
    video.buttonForAddToBookmark().click();
    videoPage.thirdMenuSection().actionLink("/bookmarks");
    BookmarksPage bookmarksPage = site.onBookmarksPage();
    bookmarksPage.bookmarksMenuPanel().bookmarks("movies").click();
    String href2 = bookmarksPage.videos().firstVideo().getAttribute("href");
    if (href2.contains("live")) {
      href2 = href2.replace("live", "video");
    }
    Assertions.assertEquals(href, href2, "Не удалось добавить видео в закладки");
  }
}
