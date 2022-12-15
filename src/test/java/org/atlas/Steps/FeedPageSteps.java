package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.FeedPage;
import org.atlas.Tests.BaseTest;

public class FeedPageSteps {

    private final BaseTest TEST;
    private final FeedPage feedPage;
    private final String VIDEO = "Видео";

  public FeedPageSteps(BaseTest test) {
    this.TEST = test;
    this.feedPage = TEST.getSite().onFeedPage();
  }

  public VideoPageSteps goToVideo() {
    feedPage.toolbar().actionLink(VIDEO).click();
    return new VideoPageSteps(TEST);
  }

  public UserGroupsPageSteps goToGroups() {
    feedPage.navigation().goToSection("Группы").click();
    return new UserGroupsPageSteps(TEST);
  }

  public VideoPageSteps goToUserPage() {
    feedPage.navigation().goToSection("technoPol4 technoPol4").click();
    return new VideoPageSteps(TEST);
  }
}
