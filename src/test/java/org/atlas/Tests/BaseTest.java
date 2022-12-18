package org.atlas.Tests;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.atlas.GuiceModule;
import org.atlas.PagesFiles.Sites.OkSite;
import org.atlas.Resources.TestBot;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
    @NotNull
    static final private String LOGIN_URL = "https://ok.ru/";
    @NotNull
    static final private String TEST_BOT_LOGIN = "technoPol4";
    @NotNull
    static final private String TEST_BOT_PASSWORD = "technoPolis2022";
    @NotNull
    static final private String TEST_BOT_ID = "585556286938";
    static protected OkSite site;
    static protected WebDriver driver;
    static protected TestBot testBot;
    @NotNull
    final private Injector injector = Guice.createInjector(new GuiceModule(this));

    @BeforeAll
    public static void setUp() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        site = new Atlas(new WebDriverConfiguration(driver, LOGIN_URL))
            .create(driver, OkSite.class);
        testBot = new TestBot(TEST_BOT_LOGIN, TEST_BOT_PASSWORD, TEST_BOT_ID);
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @BeforeEach
    public void toLogin() {
        injector.injectMembers(this);
        driver.get(LOGIN_URL);
    }

    @AfterEach
    public void closeSite() {
        driver.close();
    }

    public OkSite getSite() {
        return site;
    }

    public TestBot getTestBot() {
        return testBot;
    }

    public WebDriver getDriver() {
        return driver;
    }

}

