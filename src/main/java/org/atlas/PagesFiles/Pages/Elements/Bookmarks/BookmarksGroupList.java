package org.atlas.PagesFiles.Pages.Elements.Bookmarks;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

@SuppressWarnings("rawtypes")
public interface BookmarksGroupList extends AtlasWebElement {

    String FIRST_GROUP = "//div[@class='bookmarks-menu-group-card']";
    String GROUP = "//div[@class='bookmarks-menu-group-card']//*[text()='{{ data }}']";

    @FindBy(FIRST_GROUP)
    BookmarkedGroupCard firstGroup();

    @FindBy(GROUP)
    BookmarkedGroupCard getGroup(@Param("data") String data);

}
