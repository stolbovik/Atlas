package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.Elements.Feed.Post;
import org.atlas.PagesFiles.Pages.FeedPage;
import org.atlas.TestResources.UserInfo;
import org.atlas.Tests.BaseTest;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.Keys;

@SuppressWarnings("FieldCanBeLocal")
public class FeedPageSteps {
    @NotNull
    private final BaseTest test;
    @NotNull
    private final FeedPage feedPage;
    @NotNull
    private final String VIDEO = "Видео";
    @NotNull
    private final String GROUPS = "Группы";

    public FeedPageSteps(@NotNull final BaseTest test) {
        this.test = test;
        this.feedPage = this.test.getSite().onFeedPage();
    }

    public VideoPageSteps goToVideo() {
        feedPage.toolbar().actionLink(VIDEO).click();
        return new VideoPageSteps(test);
    }

    public UserGroupsPageSteps goToGroups() {
        feedPage.navigation().goToSection(GROUPS).click();
        return new UserGroupsPageSteps(test);
    }

    public BookmarksPageSteps goToBookmarks() {
        feedPage.thirdMenuSection().actionLink("/bookmarks").click();
        return new BookmarksPageSteps(test);
    }

    public FeedPageSteps addFirstPostToBookmark() {
        Post post = feedPage.listOfPosts().firstPost();
        post.postMenu().click();
        post.buttonForAddToBookmark().click();
        return this;
    }

    public FeedPageSteps getIdOfFirstPost(@NotNull final StringBuilder href) {
        href.append(feedPage.listOfPosts().firstPost().postBody().getAttribute("data-l"));
        return this;
    }

    public UserPageSteps findUser(@NotNull final UserInfo userInfo) {
        for (int i = 0; i < userInfo.getName().length(); i++) {
            feedPage.toolbar().searchField().sendKeys(String.valueOf(userInfo.getName().charAt(i)));
        }
        feedPage.toolbar().searchField().sendKeys(Keys.ENTER);
        return new UserPageSteps(test, userInfo.getId());
    }
}
