package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.Elements.Feed.Post;
import org.atlas.PagesFiles.Pages.FeedPage;
import org.atlas.Resources.UserInfo;
import org.atlas.Tests.BaseTest;
import org.openqa.selenium.Keys;

public class FeedPageSteps {

  private final BaseTest TEST;
  private final FeedPage feedPage;
  private final String VIDEO = "Видео";
  private final String GROUPS = "Группы";

  public FeedPageSteps(BaseTest test) {
    this.TEST = test;
    this.feedPage = TEST.getSite().onFeedPage();
  }

  public VideoPageSteps goToVideo() {
    feedPage.toolbar().actionLink(VIDEO).click();
    return new VideoPageSteps(TEST);
  }

  public UserGroupsPageSteps goToGroups() {
    feedPage.navigation().goToSection(GROUPS).click();
    return new UserGroupsPageSteps(TEST);
  }

  public BookmarksPageSteps goToBookmarks() {
    feedPage.thirdMenuSection().actionLink("/bookmarks").click();
    return new BookmarksPageSteps(TEST);
  }

  public FeedPageSteps addFirstPostToBookmark() {
    Post post = feedPage.listOfPosts().firstPost();
    post.postMenu().click();
    post.buttonForAddToBookmark().click();
    return this;
  }

  public FeedPageSteps getIdOfFirstPost(StringBuilder href) {
    href.append(feedPage.listOfPosts().firstPost().postBody().getAttribute("data-l"));
    return this;
  }

  public UserPageSteps findUser(final UserInfo userInfo) {
    for (int i = 0; i < userInfo.getName().length(); i++) {
      feedPage.toolbar().searchField().sendKeys(String.valueOf(userInfo.getName().charAt(i)));
    }
    feedPage.toolbar().searchField().sendKeys(Keys.ENTER);
    return new UserPageSteps(TEST, userInfo.getId());
  }


}
