package org.atlas.PagesFiles.Pages.Elements.Bookmarks;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.Video.Video;

@SuppressWarnings("rawtypes")
public interface BookmarksVideoList extends AtlasWebElement {

    String TO_FIRST_VIDEO = "//a[@class='video-card_lk']";

    @FindBy(TO_FIRST_VIDEO)
    Video firstVideo();

}
