package org.atlas.Config;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import java.util.Date;

public class CustomLoggingListener extends AbstractWebDriverEventListener {
    @NotNull
    private final Logger LOG;

    public CustomLoggingListener() {
        LOG = LogManager.getLogger("fileLogger");
        LOG.info("_________________________________________________________");
        LOG.info("Start test " + new Date());
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        LOG.info("Try to click on element " + element);
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        LOG.info("Clicked on element " + element);
    }
}