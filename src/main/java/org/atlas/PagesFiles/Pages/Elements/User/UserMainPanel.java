package org.atlas.PagesFiles.Pages.Elements.User;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

@SuppressWarnings("rawtypes")
public interface UserMainPanel extends AtlasWebElement {
    String OTHERS_BTN = "//li[@class='u-menu_li expand-action-item']";
    String ACTION_BTN = "//*[@class='u-menu_li __hl __custom']//*[contains(text(), '{{ data }}')]";

    @FindBy(OTHERS_BTN)
    AtlasWebElement getOtherActions();

    @FindBy(ACTION_BTN)
    AtlasWebElement chooseAction(@Param("data") String data);
}
