package org.atlas.Tests;

import org.atlas.Steps.BookmarksPageSteps;
import org.atlas.Steps.LoginPageSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@DisplayName("Тест для добавления группы в закладки")
public class TestGroupToBookmark extends BaseTest {

  private final LoginPageSteps loginSteps = new LoginPageSteps(this);
  private final String GROUP_NAME = "Одноклассники. Всё ОК!";

  @DisplayName("Добавление группы в закладки")
  @Tag("group_bookmark")
  @Test
  public void doTest() {
    StringBuilder addedGroupName = new StringBuilder();
    BookmarksPageSteps bookmarksPageSteps = loginSteps.loginIn(testBot)
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
