package org.atlas.PagesFiles.PageElements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

@SuppressWarnings("rawtypes")
public interface Navigation extends AtlasWebElement {

    String TO_ACTION_LINK = "//div[@class='nav-side_i-w']/a[@aria-label='{{ text }}']";

    @FindBy(TO_ACTION_LINK)
    AtlasWebElement goToSection(@Param("text") String text);
}
