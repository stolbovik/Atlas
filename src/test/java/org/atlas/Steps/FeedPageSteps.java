package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.FeedPage;
import org.atlas.PagesFiles.Pages.VideoPage;
import org.atlas.Tests.BaseTest;

public class FeedPageSteps {

    private final BaseTest TEST;
    private final FeedPage feedPage;
    private final String VIDEO = "Видео";

    public FeedPageSteps(BaseTest test) {
        this.TEST = test;
        this.feedPage = TEST.getSite().onFeedPage();
    }

    public FeedPageSteps goToVideo() {
        feedPage.toolbar().actionLink(VIDEO).click();
        return this;
    }

}
