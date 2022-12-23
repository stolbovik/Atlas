package org.atlas.Tests;

import com.google.inject.Inject;
import org.atlas.Steps.BookmarksPageSteps;
import org.atlas.Steps.LoginPageSteps;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test of adding video to bookmarks
 *
 * @author stolbovik
 */
@DisplayName("Тест для закладок постов")
@SuppressWarnings("FieldCanBeLocal")
public class TestPostToBookmark extends BaseTest {

    @Inject
    @NotNull
    private LoginPageSteps loginSteps;

    @Inject
    @NotNull
    private BookmarksPageSteps bookmarksPageSteps;

    @DisplayName("Добавление поста в закладки")
    @Tag("post_bookmark")
    @Test
    public void doTest() {
        StringBuilder id1 = new StringBuilder();
        StringBuilder id2 = new StringBuilder();
        bookmarksPageSteps.goToFeedPage()
            .addFirstPostToBookmark()
            .getIdOfFirstPost(id1)
            .goToBookmarks()
            .goToPostBookmarks()
            .getIdOfFirstPost(id2);
        id1.delete(0, id1.indexOf(",") + 1)
            .delete(id1.indexOf(","), id1.length());
        id2.delete(0, id2.lastIndexOf(",") + 1);
        assertThat("Не удалось добавить пост в закладки", id1.toString(), equalTo(id2.toString()));
    }

    @BeforeEach
    void logInAndCheck() {
        bookmarksPageSteps = loginSteps.loginIn(testBot)
                .goToBookmarks()
                .goToPostBookmarks();
        assertTrue(bookmarksPageSteps.checkBookmarksIsEmpty());
    }

    @AfterEach
    void cleanAfter() {
        bookmarksPageSteps.goToFeedPage().goToBookmarks().goToPostBookmarks();
        if (bookmarksPageSteps.getFirstPost().isEnabled()) {
            bookmarksPageSteps.deleteFirstPostFromBookmark();
            bookmarksPageSteps.closePostTopic().goToPostBookmarks();
        }
        assertTrue(bookmarksPageSteps.checkBookmarksIsEmpty());
    }

}
