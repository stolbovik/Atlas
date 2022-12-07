package org.atlas.Tests;

import io.qameta.atlas.webdriver.WebPage;
import org.atlas.PagesFiles.Pages.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

public class LoginTest extends BaseTest {
  @DisplayName("Тест")
  @Tag("development")
  @org.junit.jupiter.api.Test
  public void someTest() {
    atlas.onPage(LoginPage.class).input("Телефон или адрес эл. почты");
  }
}

