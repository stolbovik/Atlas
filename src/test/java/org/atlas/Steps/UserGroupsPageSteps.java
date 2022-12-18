package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.UserGroupsPage;
import org.atlas.Tests.BaseTest;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.Keys;

public class UserGroupsPageSteps {
    @NotNull
    private final BaseTest test;
    @NotNull
    private final UserGroupsPage groupsPage;

    public UserGroupsPageSteps(@NotNull final BaseTest test) {
        this.test = test;
        this.groupsPage = this.test.getSite().onGroupsPage(this.test.getTestBot().getId());
    }

    public GroupPageSteps chooseGroup(@NotNull final String name) {
        for (int i = 0; i < name.length(); i++) {
            groupsPage.groupsToolbar().searchField().sendKeys(String.valueOf(name.charAt(i)));
        }
        groupsPage.groupsToolbar().searchField().sendKeys(Keys.ENTER);
        groupsPage.groupCards().goToGroup(name).click();
        return new GroupPageSteps(test);
    }
}
