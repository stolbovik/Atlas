package org.atlas.PagesFiles.Pages.Elements.Group;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

@SuppressWarnings("rawtypes")
public interface UserGroupsToolbar extends AtlasWebElement {
  String TO_SEARCH_FIELD =
    "//*[@class='input__prt1l __size-m__prt1l input__t53m6 input-left__t53m6 input-field__9mvah']";

  @FindBy(TO_SEARCH_FIELD)
  AtlasWebElement searchField();
}
