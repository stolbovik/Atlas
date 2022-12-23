package org.atlas.Tests;

import com.google.inject.Inject;
import org.atlas.Steps.BookmarksPageSteps;
import org.atlas.Steps.FeedPageSteps;
import org.atlas.Steps.GroupPageSteps;
import org.atlas.Steps.LoginPageSteps;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

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

    @DisplayName("Добавление группы в закладки")
    @Tag("group_bookmark")
    @Test
    public void doTest() {
        StringBuilder addedGroupId = new StringBuilder();
        StringBuilder addingGroupId = new StringBuilder();

        final FeedPageSteps feedPageSteps = new FeedPageSteps(this);
        feedPageSteps.goToGroups()
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
        BookmarksPageSteps bookmarksPageSteps = loginSteps.loginIn(testBot)
            .goToBookmarks()
            .goToGroupsBookmarks();
        //assertThat(isEmpty, true);
        bookmarksPageSteps.goToFeedPage();
    }

    @AfterEach
    void cleanAfter() {
        BookmarksPageSteps bookmarksPageSteps = new BookmarksPageSteps(this);
        bookmarksPageSteps.goToGroupsBookmarks();
        GroupPageSteps groupPageSteps = bookmarksPageSteps.goToGroupPageFromBookmarks();
        //if (!isEmpty) {
        groupPageSteps.deleteGroupFromBookmark();
        //}
    }
}
