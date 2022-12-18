package org.atlas.Tests;

import com.google.inject.Inject;
import org.atlas.Resources.UserInfo;
import org.atlas.Steps.BookmarksPageSteps;
import org.atlas.Steps.LoginPageSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Тест для добавления человека в закладки")
public class TestUserToBookmark extends BaseTest {
  @Inject
  private LoginPageSteps loginSteps;
  @Inject
  private BookmarksPageSteps bookmarksPageSteps;
  @Inject
  private UserInfo userInfo;

  @DisplayName("Добавление группы в закладки")
  @Tag("group_bookmark")
  @Test
  public void doTest() {
    StringBuilder addedGroupName = new StringBuilder();
    loginSteps.loginIn(testBot)
      .findUser(userInfo)
      .addUserToBookmark()
      .goToBookmarks()
      .goToUsersBookmarks();

    /*assertThat("Не удалось добавить группу в закладки", addedGroupName.substring(1, addedGroupName.length() - 1),
      equalTo(GROUP_NAME.substring(1, GROUP_NAME.length() - 1)));

    bookmarksPageSteps.goToGroupPageFromBookmarks()
      .deleteGroupFromBookmark();*/
  }
}
