package org.atlas.PagesFiles.Pages.Elements.Group;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

@SuppressWarnings("rawtypes")
public interface GroupCard extends AtlasWebElement {
    String TO_GROUP =
        "//div[@class='ucard-v __h group-big-card __trimmed __flex']//*[contains(text(), '{{ data }}')]/..";

    @FindBy(TO_GROUP)
    AtlasWebElement goToGroup(@Param("data") String data);
}
