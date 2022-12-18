package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.GroupPage;
import org.atlas.Tests.BaseTest;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("UnusedReturnValue")
public class GroupPageSteps {
    @NotNull
    private final BaseTest test;
    @NotNull
    private final GroupPage groupPage;

    public GroupPageSteps(@NotNull final BaseTest test) {
        this.test = test;
        this.groupPage = this.test.getSite().onGroupPage();
    }

    public GroupPageSteps addGroupToBookmark() {
        groupPage.groupMainPanel().getOtherActions().click();
        groupPage.groupMainPanel().addBookmark().click();
        return this;
    }

    public GroupPageSteps deleteGroupFromBookmark() {
        groupPage.groupMainPanel().getOtherActions().click();
        groupPage.groupMainPanel().deleteBookmark().click();
        return this;
    }

    public BookmarksPageSteps goToBookmarks() {
        groupPage.thirdMenuSection().actionLink("/bookmarks").click();
        return new BookmarksPageSteps(test);
    }
}
