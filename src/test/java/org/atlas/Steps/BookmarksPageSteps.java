package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.BookmarksPage;
import org.atlas.Resources.UserInfo;
import org.atlas.Tests.BaseTest;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings({"FieldCanBeLocal", "UnusedReturnValue"})
public class BookmarksPageSteps {
    @NotNull
    private final BaseTest TEST;
    @NotNull
    private final BookmarksPage BOOKMARKS_PAGE;
    @NotNull
    private final String MOVIES = "movies";
    @NotNull
    private final String GROUPS = "groups";
    @NotNull
    private final String TOPICS = "topics";
    @NotNull
    private final String USERS = "users";

    public BookmarksPageSteps(@NotNull final BaseTest test) {
        this.TEST = test;
        this.BOOKMARKS_PAGE = this.TEST.getSite().onBookmarksPage();
    }

    public BookmarksPageSteps goToVideoBookmarks() {
        BOOKMARKS_PAGE.bookmarksMenuPanel().bookmarks(MOVIES).click();
        return this;
    }

    public BookmarksPageSteps getHrefFirstVideo(@NotNull final StringBuilder href) {
        href.append(BOOKMARKS_PAGE.videos().firstVideo().getAttribute("href"));
        return this;
    }

    public BookmarksPageSteps deleteFirstVideoFromBookmark() {
        BOOKMARKS_PAGE.videos().firstVideo().click();
        BOOKMARKS_PAGE.mediaPlayer().buttonDeleteFromBookmark().click();
        return this;
    }

    public BookmarksPageSteps goToGroupsBookmarks() {
        BOOKMARKS_PAGE.bookmarksMenuPanel().bookmarks(GROUPS).click();
        return this;
    }

    public BookmarksPageSteps goToUsersBookmarks() {
        BOOKMARKS_PAGE.bookmarksMenuPanel().bookmarks(USERS).click();
        return this;
    }

    public BookmarksPageSteps getLastGroupName(@NotNull final StringBuilder groupName) {
        groupName.append(BOOKMARKS_PAGE.groups().firstGroup().getName().getText());
        return this;
    }

    public BookmarksPageSteps getLastUserName(@NotNull final StringBuilder userName) {
        userName.append(BOOKMARKS_PAGE.users().firstUser().getText());
        return this;
    }

    public GroupPageSteps goToGroupPageFromBookmarks() {
        BOOKMARKS_PAGE.groups().firstGroup().getName().click();
        return new GroupPageSteps(TEST);
    }

    public UserPageSteps goToUserPageFromBookmarks(@NotNull final UserInfo userInfo) {
        BOOKMARKS_PAGE.users().firstUser().getName().click();
        return new UserPageSteps(TEST, userInfo.getId());
    }

    public BookmarksPageSteps goToPostBookmarks() {
        BOOKMARKS_PAGE.bookmarksMenuPanel().bookmarks(TOPICS).click();
        return this;
    }

    public BookmarksPageSteps getIdOfFirstPost(@NotNull final StringBuilder href) {
        href.append(BOOKMARKS_PAGE.posts().firstPost().postBody().getAttribute("data-l"));
        return this;
    }

    public BookmarksPageSteps deleteFirstPostFromBookmark() {
        BOOKMARKS_PAGE.posts().firstPost().postBody().click();
        BOOKMARKS_PAGE.postTopic().buttonForDeleteBookmark().click();
        return this;
    }
}
