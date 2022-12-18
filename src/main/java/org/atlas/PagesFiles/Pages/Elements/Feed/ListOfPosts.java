package org.atlas.PagesFiles.Pages.Elements.Feed;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

@SuppressWarnings("rawtypes")
public interface ListOfPosts extends AtlasWebElement {

    String TO_FIRST_POSTS = "//div[@class='feed-w']";

    @FindBy(TO_FIRST_POSTS)
    Post firstPost();

}
