package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.Group.UserGroupsToolbar;

public interface WithUserGroupsToolbar {

  String TO_GROUPS_TOOLBAR = "//div[@class='groups-catalog-header']";

  @FindBy(TO_GROUPS_TOOLBAR)
  UserGroupsToolbar groupsToolbar();
}
