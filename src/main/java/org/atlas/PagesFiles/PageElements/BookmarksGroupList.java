package org.atlas.PagesFiles.PageElements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

@SuppressWarnings("rawtypes")
public interface BookmarksGroupList extends AtlasWebElement {

    String FIRST_GROUP = "//div[@class='bookmarks-menu-group-card']";

    @FindBy(FIRST_GROUP)
    BookmarkedGroupCard firstGroup();

}
