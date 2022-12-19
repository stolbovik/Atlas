package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.BookmarksPage;
import org.atlas.TestResources.UserInfo;
import org.atlas.Tests.BaseTest;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings({"FieldCanBeLocal", "UnusedReturnValue"})
public class BookmarksPageSteps {
    @NotNull
    private final BaseTest test;
    @NotNull
    private final BookmarksPage bookmarksPage;
    @NotNull
    private final String MOVIES = "movies";
    @NotNull
    private final String GROUPS = "groups";
    @NotNull
    private final String TOPICS = "topics";
    @NotNull
    private final String USERS = "users";

    public BookmarksPageSteps(@NotNull final BaseTest test) {
        this.test = test;
        this.bookmarksPage = this.test.getSite().onBookmarksPage();
    }

    public BookmarksPageSteps goToVideoBookmarks() {
        bookmarksPage.bookmarksMenuPanel().bookmarks(MOVIES).click();
        return this;
    }

    public BookmarksPageSteps getHrefFirstVideo(@NotNull final StringBuilder href) {
        href.append(bookmarksPage.videos().firstVideo().getAttribute("href"));
        return this;
    }

    public BookmarksPageSteps deleteFirstVideoFromBookmark() {
        bookmarksPage.videos().firstVideo().click();
        bookmarksPage.mediaPlayer().buttonDeleteFromBookmark().click();
        return this;
    }

    public BookmarksPageSteps goToGroupsBookmarks() {
        bookmarksPage.bookmarksMenuPanel().bookmarks(GROUPS).click();
        return this;
    }

    public BookmarksPageSteps goToUsersBookmarks() {
        bookmarksPage.bookmarksMenuPanel().bookmarks(USERS).click();
        return this;
    }

    public BookmarksPageSteps getLastGroupId(@NotNull final StringBuilder id) {
        final String href = bookmarksPage.groups().firstGroup().getName().getAttribute("href");
        id.append(href.substring(href.lastIndexOf("/") + 1));
        return this;
    }

    public BookmarksPageSteps getLastUserId(@NotNull final StringBuilder id) {
        final String href = bookmarksPage.users().firstUser().getName().getAttribute("href");
        id.append(href.substring(href.lastIndexOf("/") + 1));
        return this;
    }

    public GroupPageSteps goToGroupPageFromBookmarks() {
        bookmarksPage.groups().firstGroup().getName().click();
        return new GroupPageSteps(test);
    }

    public UserPageSteps goToUserPageFromBookmarks(@NotNull final UserInfo userInfo) {
        bookmarksPage.users().firstUser().getName().click();
        return new UserPageSteps(test, userInfo.getId());
    }

    public BookmarksPageSteps goToPostBookmarks() {
        bookmarksPage.bookmarksMenuPanel().bookmarks(TOPICS).click();
        return this;
    }

    public BookmarksPageSteps getIdOfFirstPost(@NotNull final StringBuilder href) {
        href.append(bookmarksPage.posts().firstPost().postBody().getAttribute("data-l"));
        return this;
    }

    public BookmarksPageSteps deleteFirstPostFromBookmark() {
        bookmarksPage.posts().firstPost().descriptionPost().click();
        bookmarksPage.postTopic().buttonForDeleteBookmark().click();
        return this;
    }
}
