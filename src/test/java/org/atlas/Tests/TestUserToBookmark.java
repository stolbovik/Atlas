package org.atlas.Tests;

import com.google.inject.Inject;
import org.atlas.Steps.BookmarksPageSteps;
import org.atlas.Steps.LoginPageSteps;
import org.atlas.TestResources.UserInfo;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * Test of adding video to bookmarks
 *
 * @author aa-bushkina
 */
@DisplayName("Тест для добавления человека в закладки")
@SuppressWarnings("FieldCanBeLocal")
public class TestUserToBookmark extends BaseTest {
    @Inject
    @NotNull
    private LoginPageSteps loginSteps;

    @Inject
    @NotNull
    private BookmarksPageSteps bookmarksPageSteps;

    @Inject
    @NotNull
    private UserInfo userInfo;

    @DisplayName("Добавление человека в закладки")
    @Tag("user_bookmark")
    @Test
    public void doTest() {
        StringBuilder addedId = new StringBuilder();

        bookmarksPageSteps.goToFeedPage()
            .findUser(userInfo)
            .addUserToBookmark()
            .goToBookmarks()
            .goToUsersBookmarks()
            .getLastUserId(addedId);

        assertThat("Не удалось добавить человека в закладки", addedId.toString(),
            equalTo(userInfo.getId()));
    }

    @BeforeEach
    void logInAndCheck() {
        bookmarksPageSteps = loginSteps.loginIn(testBot)
            .goToBookmarks()
            .goToUsersBookmarks();
        assertThat("Перед тестом список групп не пуст",
            bookmarksPageSteps.checkBookmarksIsEmpty(), is(true));
    }

    @AfterEach
    void clean() {
        if (bookmarksPageSteps.getFirstUser().isEnabled()) {
            bookmarksPageSteps.goToUserPageFromBookmarks(userInfo)
                .deleteUserToBookmark()
                .goToBookmarks()
                .goToUsersBookmarks();
        }
        assertThat("После теста не произошло очищение",
            bookmarksPageSteps.checkBookmarksIsEmpty(), is(true));
    }
}
