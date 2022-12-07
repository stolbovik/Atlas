package org.atlas.tests.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

abstract public class BaseTest {
  static final private String LOGIN_URL = "https://ok.ru/";
  static public BaseSite site;
  static public WebDriver driver;

  @BeforeAll
  public static void setUp() {
    WebDriver driver;
    WebDriverManager.edgedriver().setup();
    driver = new EdgeDriver();
    driver.get(LOGIN_URL);
    site = new Atlas(new WebDriverConfiguration(driver, LOGIN_URL))
      .create(driver, BaseSite.class);
  }
}

