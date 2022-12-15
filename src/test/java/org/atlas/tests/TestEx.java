package org.atlas.tests;

import org.atlas.pagesFiles.Config;
import org.atlas.pagesFiles.pages.LoginPage;
import org.atlas.pagesFiles.pages.UserPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestEx extends BaseTest {
  @DisplayName("Тест")
  @Tag("bookmark")
  @Test
  public void someTest() {
    LoginPage loginPage = site.onLoginPage();
    loginPage.input("st.email").sendKeys(Config.USERNAME);
    loginPage.input("st.password").sendKeys(Config.PASS);
    loginPage.button("login-form-actions").click();

    UserPage userPage = site.onUserPage();
    userPage.goToAdditionalSection("Закладки").click();
  }
}
