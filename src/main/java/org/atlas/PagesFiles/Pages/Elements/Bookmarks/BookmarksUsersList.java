package org.atlas.PagesFiles.Pages.Elements.Bookmarks;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

@SuppressWarnings("rawtypes")
public interface BookmarksUsersList extends AtlasWebElement {

  String USER_LIST = "//div[@class='bookmarks-menu-user-card']";

  @FindBy(USER_LIST)
  BookmarkedUserCard firstUser();

}
