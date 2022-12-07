package org.atlas.Config;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import io.qameta.atlas.webdriver.WebPage;
import org.openqa.selenium.edge.EdgeDriver;

public class AtlasWrapper extends Atlas {

    private final EdgeDriver edgeDriver;

    public AtlasWrapper(WebDriverConfiguration driver, EdgeDriver edgeDriver) {
        super(driver);
        this.edgeDriver = edgeDriver;
    }

    public  <T extends WebPage> T onPage(Class<T> page) {
        return create(edgeDriver, page);
    }

}
