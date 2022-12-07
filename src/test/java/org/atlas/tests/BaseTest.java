package org.atlas.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.atlas.pagesFiles.sites.BaseSite;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

abstract public class BaseTest {
  static final private String LOGIN_URL = "https://ok.ru/";
  static public BaseSite site;
  static private WebDriver driver;
  @BeforeAll
  public static void setUp() {
    WebDriverManager.edgedriver().setup();
    driver = new EdgeDriver();
    driver.get(LOGIN_URL);
    site = new Atlas(new WebDriverConfiguration(driver, LOGIN_URL))
      .create(driver, BaseSite.class);
  }

  @AfterAll
  public static void end() {
    driver.close();
  }

}

