package org.atlas.Tests;

import com.google.inject.Inject;
import org.atlas.Steps.BookmarksPageSteps;
import org.atlas.Steps.LoginPageSteps;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Test of adding video to bookmarks
 *
 * @author stolbovik
 */
@DisplayName("Тест для видеозакладок")
public class TestVideoToBookmark extends BaseTest {
    @Inject
    @NotNull
    private LoginPageSteps loginSteps;

    @Inject
    @NotNull
    private BookmarksPageSteps bookmarksPageSteps;

    @DisplayName("Добавление видео в закладки")
    @Tag("video_bookmark")
    @Test
    public void doTest() {
        StringBuilder href = new StringBuilder();
        StringBuilder href2 = new StringBuilder();
        bookmarksPageSteps = loginSteps.loginIn(testBot)
            .goToVideo()
            .getHrefFirstVideo(href)
            .addFirstVideoToBookmark()
            .goToBookmarks()
            .goToVideoBookmarks()
            .getHrefFirstVideo(href2);
        if (href2.toString().contains("live")) {
            href2 = new StringBuilder(href2.toString().replace("live", "video"));
        }
        assertThat("Не удалось добавить видео в закладки", href.toString(), equalTo(href2.toString()));
        bookmarksPageSteps.deleteFirstVideoFromBookmark();
    }
}
