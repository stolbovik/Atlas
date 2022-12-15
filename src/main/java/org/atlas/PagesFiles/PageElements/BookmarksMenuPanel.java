package org.atlas.PagesFiles.PageElements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

@SuppressWarnings("rawtypes")
public interface BookmarksMenuPanel extends AtlasWebElement {

    String TO_BOOKMARKS = "//a[@href='/bookmarks/{{ data }}']";
    //String TO_BOOKMARKS = "//div[@class='nav-side_i-w']//*[contains(text(), '{{data}}')]/../..";

    @FindBy(TO_BOOKMARKS)
    AtlasWebElement bookmarks(@Param("data") String data);

}
