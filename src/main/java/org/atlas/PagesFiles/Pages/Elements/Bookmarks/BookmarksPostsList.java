package org.atlas.PagesFiles.Pages.Elements.Bookmarks;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.Feed.Post;

public interface BookmarksPostsList extends AtlasWebElement {

    String TO_FIRST_POST = "//div[@class='feed']";

    @FindBy(TO_FIRST_POST)
    Post firstPost();

}
