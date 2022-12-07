package org.atlas.Config;

import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import io.qameta.atlas.webdriver.WebPage;

public class AtlasWrapper extends Atlas {

    private final WebDriverConfiguration driver;

    public AtlasWrapper(WebDriverConfiguration driver) {
        super(driver);
        this.driver = driver;
    }

    public  <T extends WebPage> T onPage(Class<T> page) {
        return create(driver, page);
    }

}
