package org.atlas.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.atlas.Resources.TestBot;
import org.atlas.PagesFiles.Sites.OkSite;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
  static final private String LOGIN_URL = "https://ok.ru/";
  static final private String TEST_BOT_LOGIN = "technoPol4";
  static final private String TEST_BOT_PASSWORD = "technoPolis2022";
  static protected OkSite site;
  static protected WebDriver driver;
  static protected TestBot testBot;
  static protected WebDriverWait webDriverWait;
  @BeforeAll
  public static void setUp() {
    WebDriverManager.edgedriver().setup();
    driver = new EdgeDriver();
    site = new Atlas(new WebDriverConfiguration(driver, LOGIN_URL))
      .create(driver, OkSite.class);
    testBot = new TestBot(TEST_BOT_LOGIN, TEST_BOT_PASSWORD);
    webDriverWait = new WebDriverWait(driver, 5);
  }

  @BeforeEach
  public void toLogin() {
    driver.get(LOGIN_URL);
  }

  @AfterEach
  public void closeSite() {
    driver.close();
  }

  @AfterAll
  public static void tearDown() {
    driver.quit();
  }

  public OkSite getSite() {
    return site;
  }
  public WebDriver getDriver() {
    return driver;
  }
  public WebDriverWait getWebDriverWait() {
    return webDriverWait;
  }

}

