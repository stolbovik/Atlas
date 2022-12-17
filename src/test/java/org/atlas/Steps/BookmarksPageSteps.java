package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.BookmarksPage;
import org.atlas.Tests.BaseTest;

public class BookmarksPageSteps {

  private final BaseTest TEST;
  private final BookmarksPage bookmarksPage;
  private final String MOVIES = "movies";
  private final String GROUPS = "groups";
  private final String TOPICS = "topics";

  public BookmarksPageSteps(BaseTest test) {
    this.TEST = test;
    this.bookmarksPage = this.TEST.getSite().onBookmarksPage();
  }

  public BookmarksPageSteps goToVideoBookmarks() {
    bookmarksPage.bookmarksMenuPanel().bookmarks(MOVIES).click();
    return this;
  }

  public BookmarksPageSteps getHrefFirstVideo(StringBuilder href) {
    href.append(bookmarksPage.videos().firstVideo().getAttribute("href"));
    return this;
  }

  public BookmarksPageSteps deleteFirstVideoFromBookmark() {
    bookmarksPage.videos().firstVideo().click();
    bookmarksPage.toMediaPlayer().toButtonDeleteFromBookmark().click();
    return this;
  }

  public BookmarksPageSteps goToGroupsBookmarks() {
    bookmarksPage.bookmarksMenuPanel().bookmarks(GROUPS).click();
    return this;
  }

  public BookmarksPageSteps getLastGroupName(StringBuilder groupName) {
    groupName.append(bookmarksPage.groups().firstGroup().getName().getText());
    return this;
  }

  public GroupPageSteps goToGroupPageFromBookmarks() {
    bookmarksPage.groups().firstGroup().getName().click();
    return new GroupPageSteps(TEST);
  }

  public BookmarksPageSteps goToPostBookmarks() {
    bookmarksPage.bookmarksMenuPanel().bookmarks(TOPICS).click();
    return this;
  }

  public BookmarksPageSteps getIdOfFirstPost(StringBuilder href) {
    href.append(bookmarksPage.posts().firstPost().postBody().getAttribute("data-l"));
    return this;
  }
}
