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
 * @author aa-bushkina
 */
@DisplayName("Тест для добавления группы в закладки")
public class TestGroupToBookmark extends BaseTest {
    @NotNull
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
        StringBuilder addedGroupName = new StringBuilder();
        bookmarksPageSteps = loginSteps.loginIn(testBot)
            .goToGroups()
            .chooseGroup(GROUP_NAME)
            .addGroupToBookmark()
            .goToBookmarks()
            .goToGroupsBookmarks()
            .getLastGroupName(addedGroupName);

        assertThat("Не удалось добавить группу в закладки", addedGroupName.substring(1, addedGroupName.length() - 1),
            equalTo(GROUP_NAME.substring(1, GROUP_NAME.length() - 1)));

        bookmarksPageSteps.goToGroupPageFromBookmarks()
            .deleteGroupFromBookmark();
    }
}
