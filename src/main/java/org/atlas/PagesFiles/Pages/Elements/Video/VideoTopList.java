package org.atlas.PagesFiles.Pages.Elements.Video;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

@SuppressWarnings("rawtypes")
public interface VideoTopList extends AtlasWebElement {

    String TO_FIRST_VIDEO = "//a[@class='video-card_lk']";

    @FindBy(TO_FIRST_VIDEO)
    Video firstVideo();

}
