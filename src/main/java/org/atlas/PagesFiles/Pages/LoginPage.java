package org.atlas.PagesFiles.Pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface LoginPage extends WebPage {

    @FindBy("//div[text()='{{ text }}']/input")
    AtlasWebElement input(@Param("text") String text);

}
