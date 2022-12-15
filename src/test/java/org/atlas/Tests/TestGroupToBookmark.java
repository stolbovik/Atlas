package org.atlas.Tests;

import org.atlas.Steps.LoginPageSteps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Тест для добавления группы в закладки")
public class TestGroupToBookmark extends BaseTest {

  private final LoginPageSteps loginSteps = new LoginPageSteps(this);
  private final String GROUP_NAME = "Одноклассники. Всё ОК!";

  @DisplayName("Добавление группы в закладки")
  @Tag("group_bookmark")
  @Test
  public void doTest() {
    loginSteps.loginIn(testBot)
      .goToGroups()
      .chooseGroup(GROUP_NAME);
  }
}
