package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.PageElements.GroupCard;
import org.atlas.PagesFiles.PageElements.UserGroupsToolbar;

public interface WithGroupCards {

  String TO_GROUP_CARDS = "//div[@id='hook_Loader_UserGroupsSearchPortalLoader']";

  @FindBy(TO_GROUP_CARDS)
  GroupCard groupCards();
}
