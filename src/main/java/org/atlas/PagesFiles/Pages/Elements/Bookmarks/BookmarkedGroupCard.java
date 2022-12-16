package org.atlas.PagesFiles.Pages.Elements.Bookmarks;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

@SuppressWarnings("rawtypes")
public interface BookmarkedGroupCard extends AtlasWebElement {

    String TITLE = "//a[@class='ellip o bookmarks-menu-group-card__title']";

    @FindBy(TITLE)
    AtlasWebElement getName();
}
