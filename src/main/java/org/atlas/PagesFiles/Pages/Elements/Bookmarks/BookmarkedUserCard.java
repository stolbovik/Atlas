package org.atlas.PagesFiles.Pages.Elements.Bookmarks;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

@SuppressWarnings("rawtypes")
public interface BookmarkedUserCard extends AtlasWebElement {

    String NAME = "//a[@class='ellip o bookmarks-menu-user-card__title']";

    @FindBy(NAME)
    AtlasWebElement getName();
}
