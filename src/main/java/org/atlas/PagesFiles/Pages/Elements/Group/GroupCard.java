package org.atlas.PagesFiles.Pages.Elements.Group;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

@SuppressWarnings("rawtypes")
public interface GroupCard extends AtlasWebElement {
    String TO_GROUP =
        "//a[@data-l='t,visit']//*[text()='{{ data }}']/..";

    @FindBy(TO_GROUP)
    AtlasWebElement goToGroup(@Param("data") String data);
}
