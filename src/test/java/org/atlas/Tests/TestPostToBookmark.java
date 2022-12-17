package org.atlas.Tests;

import com.google.inject.Inject;
import org.atlas.Steps.BookmarksPageSteps;
import org.atlas.Steps.LoginPageSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@DisplayName("Тест для закладок постов")
public class TestPostToBookmark extends BaseTest{

    @Inject
    private LoginPageSteps loginSteps;

    @Inject
    private BookmarksPageSteps bookmarksPageSteps;

    @DisplayName("Добавление поста в закладки")
    @Tag("post_bookmark")
    @Test
    public void doTest() {
        StringBuilder id1 = new StringBuilder();
        StringBuilder id2 = new StringBuilder();
        bookmarksPageSteps = loginSteps.loginIn(testBot)
                .addFirstPostToBookmark()
                .getIdOfFirstPost(id1)
                .goToBookmarks()
                .goToPostBookmarks()
                .getIdOfFirstPost(id2);
        id1.delete(0, id1.indexOf(",") + 1)
           .delete(id1.indexOf(","), id1.length());
        id2.delete(0, id2.lastIndexOf(",") + 1);
        assertThat("Не удалось добавить пост в закладки", id1.toString(), equalTo(id2.toString()));
        bookmarksPageSteps.deleteFirstPostFromBookmark();
    }

}
