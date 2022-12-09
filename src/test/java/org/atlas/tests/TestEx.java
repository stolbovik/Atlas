package org.atlas.tests;

import org.atlas.pagesFiles.pages.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestEx extends BaseTest {
  @DisplayName("Тест")
  @Tag("bookmark")
  @Test
  public void someTest() {
    LoginPage loginPage = site.onLoginPage();
    loginPage.input("st.email").sendKeys("technoPol4");
    loginPage.input("st.password").sendKeys("technoPolis2022");
    loginPage.button("login-form-actions").click();
  }
}
