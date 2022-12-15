package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.GroupPage;
import org.atlas.Tests.BaseTest;

public class GroupPageSteps {

  private final BaseTest TEST;
  private final GroupPage groupPage;

  public GroupPageSteps(final BaseTest test) {
    this.TEST = test;
    this.groupPage = TEST.getSite().onGroupPage();
  }

  public GroupPageSteps addBookmark() {
    groupPage.groupMainPanel().getOtherActions().click();
    groupPage.groupMainPanel().addBookmark().click();
    return this;
  }

  public BookmarksPageSteps goToBookmarks() {
    groupPage.thirdMenuSection().actionLink("/bookmarks").click();
    return new BookmarksPageSteps(TEST);
  }

}
