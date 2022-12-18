package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.UserGroupsPage;
import org.atlas.Tests.BaseTest;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.Keys;

public class UserGroupsPageSteps {
    @NotNull
    private final BaseTest TEST;
    @NotNull
    private final UserGroupsPage GROUP_PAGE;

    public UserGroupsPageSteps(@NotNull final BaseTest test) {
        this.TEST = test;
        this.GROUP_PAGE = TEST.getSite().onGroupsPage(TEST.getTestBot().getId());
    }

    public GroupPageSteps chooseGroup(@NotNull final String name) {
        for (int i = 0; i < name.length(); i++) {
            GROUP_PAGE.groupsToolbar().searchField().sendKeys(String.valueOf(name.charAt(i)));
        }
        GROUP_PAGE.groupsToolbar().searchField().sendKeys(Keys.ENTER);
        GROUP_PAGE.groupCards().goToGroup(name).click();
        return new GroupPageSteps(TEST);
    }
}
