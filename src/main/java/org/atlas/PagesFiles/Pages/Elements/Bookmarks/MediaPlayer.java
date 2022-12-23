package org.atlas.PagesFiles.Pages.Elements.Bookmarks;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

@SuppressWarnings("rawtypes")
public interface MediaPlayer extends AtlasWebElement {

    String TO_BUTTON_DELETE_VIDEO_FROM_BOOKMARK = "//div[@class='widget_cnt']";

    @FindBy(TO_BUTTON_DELETE_VIDEO_FROM_BOOKMARK)
    AtlasWebElement buttonDeleteFromBookmark();

    String TO_BUTTON_CLOSE_PLAYER = "//*[@id='vpl_close']//div";

    @FindBy(TO_BUTTON_CLOSE_PLAYER)
    AtlasWebElement closePlayer();

}
