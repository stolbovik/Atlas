package org.atlas.PagesFiles.Pages.Elements.Feed;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface Post extends AtlasWebElement {

    String TO_POST_MENU = "//div[@class='feed_menu']";
    String TO_BUTTON_FOR_ADD_TO_BOOKMARK = "//a[@data-l='t,bookmarks_feed_add_link']";
    String TO_BODY_POST = "//div[@class='feed_cnt']";

    @FindBy(TO_POST_MENU)
    AtlasWebElement postMenu();

    @FindBy(TO_BUTTON_FOR_ADD_TO_BOOKMARK)
    AtlasWebElement buttonForAddToBookmark();

    @FindBy(TO_BODY_POST)
    AtlasWebElement postBody();

}
