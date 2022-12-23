package org.atlas.PagesFiles.Pages.Elements.Group;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

@SuppressWarnings("rawtypes")
public interface UserGroupsToolbar extends AtlasWebElement {
    String TO_SEARCH_FIELD =
        "//*[@class='filter_search']//*[@type='text']";

    @FindBy(TO_SEARCH_FIELD)
    AtlasWebElement searchField();
}
