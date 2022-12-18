package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.UserPage;
import org.atlas.Tests.BaseTest;
import org.jetbrains.annotations.NotNull;

public class UserPageSteps {

    private final BaseTest TEST;
    private final UserPage userPage;

    public UserPageSteps(@NotNull final BaseTest test, @NotNull final String id) {
        this.TEST = test;
        this.userPage = TEST.getSite().onUserPage(id);
    }

    public UserPageSteps addUserToBookmark() {
        userPage.userMainPanel().getOtherActions().click();
        userPage.userMainPanel().chooseAction("Добавить в закладки").click();
        return this;
    }

    public UserPageSteps deleteUserToBookmark() {
        userPage.userMainPanel().getOtherActions().click();
        userPage.userMainPanel().chooseAction("Убрать из закладок").click();
        return this;
    }

    public BookmarksPageSteps goToBookmarks() {
        userPage.thirdMenuSection().actionLink("/bookmarks").click();
        return new BookmarksPageSteps(TEST);
    }

}
