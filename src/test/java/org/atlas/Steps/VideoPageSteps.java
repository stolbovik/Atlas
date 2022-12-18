package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.Elements.Video.Video;
import org.atlas.PagesFiles.Pages.VideoPage;
import org.atlas.Tests.BaseTest;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.interactions.Actions;

public class VideoPageSteps {
    @NotNull
    private final BaseTest TEST;
    @NotNull
    private final VideoPage videoPage;

    public VideoPageSteps(@NotNull BaseTest test) {
        this.TEST = test;
        this.videoPage = TEST.getSite().onVideoPage();
    }

    public VideoPageSteps addFirstVideoToBookmark() {
        final Video video = videoPage.videoTopList().firstVideo();
        final Actions action = new Actions(TEST.getDriver());
        action.moveToElement(video).perform();
        video.videoMenu().click();
        video.buttonForAddToBookmark().click();
        return this;
    }

    public BookmarksPageSteps goToBookmarks() {
        videoPage.thirdMenuSection().actionLink("/bookmarks").click();
        return new BookmarksPageSteps(TEST);
    }

    public VideoPageSteps getHrefFirstVideo(@NotNull final StringBuilder href) {
        href.append(videoPage.videoTopList().firstVideo().getAttribute("href"));
        return this;
    }

}
