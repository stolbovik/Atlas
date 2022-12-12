package org.atlas.pagesFiles.withElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.pagesFiles.pageElements.VideoTopList;

public interface WithVideoTopList {

    String TO_VIDEO_LIST = "//div[@id='listBlockPanelVideoTopBlock']";

    @FindBy(TO_VIDEO_LIST)
    VideoTopList videoTopList();

}
