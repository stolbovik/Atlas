package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.BookmarksPage;
import org.atlas.PagesFiles.Pages.Elements.Bookmarks.BookmarkedGroupCard;
import org.atlas.PagesFiles.Pages.Elements.Bookmarks.BookmarkedUserCard;
import org.atlas.PagesFiles.Pages.Elements.Feed.Post;
import org.atlas.PagesFiles.Pages.Elements.Video.Video;
import org.atlas.TestResources.UserInfo;
import org.atlas.Tests.BaseTest;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings({"FieldCanBeLocal", "UnusedReturnValue"})
public class BookmarksPageSteps {
    @NotNull
    private final BaseTest test;
    @NotNull
    private final BookmarksPage bookmarksPage;
    private final String MOVIES = "movies";
    private final String GROUPS = "groups";
    private final String TOPICS = "topics";
    private final String USERS = "users";
    private final String VIDEO_PAGE = "Видео";

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

    public Video getFirstVideo() {
        return bookmarksPage.videos().firstVideo();
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

    public BookmarkedUserCard getFirstUser() {
        return bookmarksPage.users().firstUser();
    }

    public BookmarkedGroupCard getFirstGroup() {
        return bookmarksPage.groups().firstGroup();
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

    public Post getFirstPost() {
        return bookmarksPage.posts().firstPost();
    }

    public BookmarksPageSteps deleteFirstPostFromBookmark() {
        bookmarksPage.posts().firstPost().descriptionPost().click();
        bookmarksPage.postTopic().buttonForDeleteBookmark().click();
        return this;
    }

    public FeedPageSteps goToFeedPage() {
        bookmarksPage.toolbar().logo().click();
        return new FeedPageSteps(test);
    }

    public VideoPageSteps goToVideoPage() {
        bookmarksPage.toolbar().actionLink(VIDEO_PAGE).click();
        return new VideoPageSteps(test);
    }

    public boolean checkBookmarksIsEmpty() {
        return bookmarksPage.emptyBlock().isEnabled();
    }

    public BookmarksPageSteps closePlayer() {
        bookmarksPage.mediaPlayer().closePlayer().click();
        return this;
    }

    public BookmarksPageSteps closePostTopic() {
        bookmarksPage.postTopic().closePost().click();
        return this;
    }
}
