package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.GroupPage;
import org.atlas.Tests.BaseTest;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("UnusedReturnValue")
public class GroupPageSteps {
    @NotNull
    private final BaseTest TEST;
    @NotNull
    private final GroupPage GROUP_PAGE;

    public GroupPageSteps(@NotNull final BaseTest test) {
        this.TEST = test;
        this.GROUP_PAGE = TEST.getSite().onGroupPage();
    }

    public GroupPageSteps addGroupToBookmark() {
        GROUP_PAGE.groupMainPanel().getOtherActions().click();
        GROUP_PAGE.groupMainPanel().addBookmark().click();
        return this;
    }

    public GroupPageSteps deleteGroupFromBookmark() {
        GROUP_PAGE.groupMainPanel().getOtherActions().click();
        GROUP_PAGE.groupMainPanel().deleteBookmark().click();
        return this;
    }

    public BookmarksPageSteps goToBookmarks() {
        GROUP_PAGE.thirdMenuSection().actionLink("/bookmarks").click();
        return new BookmarksPageSteps(TEST);
    }
}
