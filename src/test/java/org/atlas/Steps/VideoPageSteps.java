package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.Elements.Video.Video;
import org.atlas.PagesFiles.Pages.VideoPage;
import org.atlas.Tests.BaseTest;
import org.openqa.selenium.interactions.Actions;

public class VideoPageSteps {

    private final BaseTest TEST;
    private final VideoPage videoPage;

    public VideoPageSteps(BaseTest test) {
        this.TEST = test;
        this.videoPage = TEST.getSite().onVideoPage();
    }

    public VideoPageSteps addVideoToBookmark() {
        Video video = videoPage.videoTopList().firstVideo();
        Actions action = new Actions(TEST.getDriver());
        action.moveToElement(video).perform();
        video.videoMenu().click();
        video.buttonForAddToBookmark().click();
        return this;
    }

    public BookmarksPageSteps goToBookmarks() {
        videoPage.thirdMenuSection().actionLink("/bookmarks").click();
        return new BookmarksPageSteps(TEST);
    }

    public VideoPageSteps getHrefFirstVideo(StringBuilder href) {
        href.append(videoPage.videoTopList().firstVideo().getAttribute("href"));
        return this;
    }

}
