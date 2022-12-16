package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.Video.VideoTopList;

public interface WithVideoTopList {

    String TO_VIDEO_LIST = "//div[@id='listBlockPanelVideoTopBlock']";

    @FindBy(TO_VIDEO_LIST)
    VideoTopList videoTopList();

}
