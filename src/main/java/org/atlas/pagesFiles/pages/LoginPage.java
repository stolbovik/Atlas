package org.atlas.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface LoginPage extends WebPage {

    @FindBy("//*[@name='{{ text }}']")
    AtlasWebElement input(@Param("text") String text);

    @FindBy("//*[@class='{{ text }}']/input")
    AtlasWebElement button(@Param("text") String text);

}