package org.atlas.PagesFiles.Pages.Elements.Bookmarks;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

@SuppressWarnings("rawtypes")
public interface BookmarksMenuPanel extends AtlasWebElement {

    String TO_BOOKMARKS = "//a[@href='/bookmarks/{{ data }}']";

    @FindBy(TO_BOOKMARKS)
    AtlasWebElement bookmarks(@Param("data") String data);

    String TO_ALL_BOOKMARKS = "//div[@class='nav-side_i-w']/a[@href='/bookmarks']";

    @FindBy(TO_ALL_BOOKMARKS)
    AtlasWebElement allBookmarks();

}
