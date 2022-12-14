package org.atlas.Tests;

import com.google.inject.Inject;
import org.atlas.Steps.BookmarksPageSteps;
import org.atlas.Steps.LoginPageSteps;
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
@SuppressWarnings("FieldCanBeLocal")
@DisplayName("Тест для добавления группы в закладки")
public class TestGroupToBookmark extends BaseTest {

    private final String GROUP_NAME = "Одноклассники. Всё ОК!";

    @Inject
    @NotNull
    private LoginPageSteps loginSteps;

    @Inject
    @NotNull
    private BookmarksPageSteps bookmarksPageSteps;

    @DisplayName("Добавление группы в закладки")
    @Tag("group_bookmark")
    @Test
    public void doTest() {
        StringBuilder addedGroupId = new StringBuilder();
        StringBuilder addingGroupId = new StringBuilder();

        bookmarksPageSteps.goToFeedPage()
            .goToGroups()
            .chooseGroup(GROUP_NAME, addingGroupId)
            .addGroupToBookmark()
            .goToBookmarks()
            .goToGroupsBookmarks()
            .getLastGroupId(addedGroupId);

        assertThat("Не удалось добавить группу в закладки", addedGroupId.toString(),
            equalTo(addingGroupId.toString()));
    }

    @BeforeEach
    void logInAndCheck() {
        bookmarksPageSteps = loginSteps.loginIn(testBot)
            .goToBookmarks()
            .goToGroupsBookmarks();
        assertThat("Перед тестом список групп не пуст",
            bookmarksPageSteps.checkBookmarksIsEmpty(), is(true));
    }

    @AfterEach
    void cleanAfter() {
        if (bookmarksPageSteps.getGroup(GROUP_NAME).isEnabled()) {
            bookmarksPageSteps.goToGroupPageFromBookmarks()
                .deleteGroupFromBookmark()
                .goToBookmarks()
                .goToGroupsBookmarks();
        }
        assertThat("После теста не произошло очищение",
            bookmarksPageSteps.checkBookmarksIsEmpty(), is(true));
    }
}
