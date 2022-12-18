package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.Elements.Video.Video;
import org.atlas.PagesFiles.Pages.VideoPage;
import org.atlas.Tests.BaseTest;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.interactions.Actions;

public class VideoPageSteps {
    @NotNull
    private final BaseTest test;
    @NotNull
    private final VideoPage videoPage;

    public VideoPageSteps(@NotNull final BaseTest test) {
        this.test = test;
        this.videoPage = this.test.getSite().onVideoPage();
    }

    public VideoPageSteps addFirstVideoToBookmark() {
        final Video video = videoPage.videoTopList().firstVideo();
        final Actions action = new Actions(test.getDriver());
        action.moveToElement(video).perform();
        video.videoMenu().click();
        video.buttonForAddToBookmark().click();
        return this;
    }

    public BookmarksPageSteps goToBookmarks() {
        videoPage.thirdMenuSection().actionLink("/bookmarks").click();
        return new BookmarksPageSteps(test);
    }

    public VideoPageSteps getHrefFirstVideo(@NotNull final StringBuilder href) {
        href.append(videoPage.videoTopList().firstVideo().getAttribute("href"));
        return this;
    }
}
