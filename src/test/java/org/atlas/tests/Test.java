package org.atlas.tests;

import org.atlas.pages.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

public class Test extends BaseTest {
  @DisplayName("Тест")
  @Tag("development")
  @org.junit.jupiter.api.Test
  public void someTest() {
    LoginPage loginPage = site.onLoginPage();
    loginPage.input("st.email").sendKeys("technoPol4");
    loginPage.input("st.password").sendKeys("technoPolis2022");
    loginPage.button("login-form-actions").click();
  }
}
