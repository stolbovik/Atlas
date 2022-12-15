package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.UserGroupsPage;
import org.atlas.Tests.BaseTest;

public class GroupPageSteps {

    private final BaseTest TEST;
    private final UserGroupsPage groupsPage;

    public GroupPageSteps(final BaseTest test) {
        this.TEST = test;
        this.groupsPage = TEST.getSite().onGroupsPage(TEST.getUserId());
    }

    public GroupPageSteps goToGroup(final String name) {
        groupsPage.groupsToolbar().searchField().sendKeys(name);
        return new GroupPageSteps(TEST);
    }

}
