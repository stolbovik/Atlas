package org.atlas.Tests;

import com.google.inject.Inject;
import org.atlas.Resources.UserInfo;
import org.atlas.Steps.BookmarksPageSteps;
import org.atlas.Steps.LoginPageSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@DisplayName("Тест для добавления человека в закладки")
public class TestUserToBookmark extends BaseTest {
  @Inject
  private LoginPageSteps loginSteps;
  @Inject
  private BookmarksPageSteps bookmarksPageSteps;
  @Inject
  private UserInfo userInfo;

  @DisplayName("Добавление человека в закладки")
  @Tag("user_bookmark")
  @Test
  public void doTest() {
    StringBuilder addedUserName = new StringBuilder();
    bookmarksPageSteps = loginSteps.loginIn(testBot)
      .findUser(userInfo)
      .addUserToBookmark()
      .goToBookmarks()
      .goToUsersBookmarks()
      .getLastUserName(addedUserName);

    assertThat("Не удалось добавить человека в закладки", addedUserName.substring(1, addedUserName.length() - 1),
      equalTo(userInfo.getName().substring(1, userInfo.getName().length() - 1)));

    bookmarksPageSteps.goToUserPageFromBookmarks(userInfo)
      .deleteUserToBookmark();
  }
}
