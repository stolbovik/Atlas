package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.UserPage;
import org.atlas.Tests.BaseTest;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("UnusedReturnValue")
public class UserPageSteps {

    @NotNull
    private final BaseTest TEST;
    @NotNull
    private final UserPage USER_PAGE;

    public UserPageSteps(@NotNull final BaseTest test, @NotNull final String id) {
        this.TEST = test;
        this.USER_PAGE = TEST.getSite().onUserPage(id);
    }

    public UserPageSteps addUserToBookmark() {
        USER_PAGE.userMainPanel().getOtherActions().click();
        USER_PAGE.userMainPanel().chooseAction("Добавить в закладки").click();
        return this;
    }

    public UserPageSteps deleteUserToBookmark() {
        USER_PAGE.userMainPanel().getOtherActions().click();
        USER_PAGE.userMainPanel().chooseAction("Убрать из закладок").click();
        return this;
    }

    public BookmarksPageSteps goToBookmarks() {
        USER_PAGE.thirdMenuSection().actionLink("/bookmarks").click();
        return new BookmarksPageSteps(TEST);
    }
}
