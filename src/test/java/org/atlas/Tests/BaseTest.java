package org.atlas.Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.atlas.Config.AtlasWrapper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.edge.EdgeDriver;

abstract public class BaseTest {
  static final private String LOGIN_URL = "https://ok.ru/";
  static public AtlasWrapper atlas;

  @BeforeAll
  public static void setUp() {
    EdgeDriver edgeDriver = new EdgeDriver();
    atlas = new AtlasWrapper(new WebDriverConfiguration(edgeDriver), edgeDriver);
    WebDriverManager.edgedriver().setup();
    Configuration.browser = "edge";
    Configuration.driverManagerEnabled = true;
    Configuration.holdBrowserOpen = true;
    Selenide.open(LOGIN_URL);
  }

  @AfterAll
  public static void tearDown() {
    Selenide.closeWebDriver();
  }

}

