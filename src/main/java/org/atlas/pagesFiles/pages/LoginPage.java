package org.atlas.pagesFiles.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;
@SuppressWarnings("rawtypes")
public interface LoginPage extends WebPage {

    String TO_INPUT = "//*[@name='{{ text }}']";
    String TO_BUTTON = "//*[@class='{{ text }}']/input";

    @FindBy(TO_INPUT)
    AtlasWebElement input(@Param("text") String text);

    @FindBy(TO_BUTTON)
    AtlasWebElement button(@Param("text") String text);

}