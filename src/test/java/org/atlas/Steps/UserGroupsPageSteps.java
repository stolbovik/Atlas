package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.UserGroupsPage;
import org.atlas.Tests.BaseTest;
import org.openqa.selenium.Keys;

public class UserGroupsPageSteps {

    private final BaseTest TEST;
    private final UserGroupsPage groupsPage;

    public UserGroupsPageSteps(final BaseTest test) {
        this.TEST = test;
        this.groupsPage = TEST.getSite().onGroupsPage(TEST.getUserId());
    }

    public GroupPageSteps chooseGroup(final String name) {
        groupsPage.groupsToolbar().searchField().sendKeys(name, Keys.ENTER);
        groupsPage.groupCards().goToGroup(name).click();
        return new GroupPageSteps(TEST);
    }

}
