package org.atlas.PagesFiles.Pages.Elements.Video;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

@SuppressWarnings("rawtypes")
public interface Video extends AtlasWebElement {

    String TO_VIDEO_MENU = "//div[@class='video-card_menu']";
    String TO_BUTTON_FOR_ADD_TO_BOOKMARK = "//*[contains(@href, 'ADD_TO_BOOKMARKS')]";

    @FindBy(TO_VIDEO_MENU)
    AtlasWebElement videoMenu();

    @FindBy(TO_BUTTON_FOR_ADD_TO_BOOKMARK)
    AtlasWebElement buttonForAddToBookmark();
}
