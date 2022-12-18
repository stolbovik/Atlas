package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.Elements.Feed.Post;
import org.atlas.PagesFiles.Pages.FeedPage;
import org.atlas.Resources.UserInfo;
import org.atlas.Tests.BaseTest;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.Keys;

@SuppressWarnings("FieldCanBeLocal")
public class FeedPageSteps {
    @NotNull
    private final BaseTest TEST;
    @NotNull
    private final FeedPage FEED_PAGE;
    @NotNull
    private final String VIDEO = "Видео";
    @NotNull
    private final String GROUPS = "Группы";

    public FeedPageSteps(@NotNull final BaseTest test) {
        this.TEST = test;
        this.FEED_PAGE = TEST.getSite().onFeedPage();
    }

    public VideoPageSteps goToVideo() {
        FEED_PAGE.toolbar().actionLink(VIDEO).click();
        return new VideoPageSteps(TEST);
    }

    public UserGroupsPageSteps goToGroups() {
        FEED_PAGE.navigation().goToSection(GROUPS).click();
        return new UserGroupsPageSteps(TEST);
    }

    public BookmarksPageSteps goToBookmarks() {
        FEED_PAGE.thirdMenuSection().actionLink("/bookmarks").click();
        return new BookmarksPageSteps(TEST);
    }

    public FeedPageSteps addFirstPostToBookmark() {
        Post post = FEED_PAGE.listOfPosts().firstPost();
        post.postMenu().click();
        post.buttonForAddToBookmark().click();
        return this;
    }

    public FeedPageSteps getIdOfFirstPost(@NotNull final StringBuilder href) {
        href.append(FEED_PAGE.listOfPosts().firstPost().postBody().getAttribute("data-l"));
        return this;
    }

    public UserPageSteps findUser(@NotNull final UserInfo userInfo) {
        for (int i = 0; i < userInfo.getName().length(); i++) {
            FEED_PAGE.toolbar().searchField().sendKeys(String.valueOf(userInfo.getName().charAt(i)));
        }
        FEED_PAGE.toolbar().searchField().sendKeys(Keys.ENTER);
        return new UserPageSteps(TEST, userInfo.getId());
    }
}
