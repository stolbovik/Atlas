package org.atlas.PagesFiles.Pages.Elements.Group;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

@SuppressWarnings("rawtypes")
public interface GroupMainPanel extends AtlasWebElement {
  String OTHERS_BTN = "//li[@class='u-menu_li expand-action-item']";
  String ADD_BOOKMARK_BTN = "//a[@data-l='t,addBookmarkButton']";
  String DELETE_BOOKMARK_BTN = "//a[@data-l='t,removeBookmarkButton']";

  @FindBy(OTHERS_BTN)
  AtlasWebElement getOtherActions();

  @FindBy(ADD_BOOKMARK_BTN)
  AtlasWebElement addBookmark();

  @FindBy(DELETE_BOOKMARK_BTN)
  AtlasWebElement deleteBookmark();
}
