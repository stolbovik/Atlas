package org.atlas.pagesFiles.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.pagesFiles.pageElements.WithToolbar;

@SuppressWarnings("rawtypes")
public interface UserPage extends WebPage, WithToolbar {

  String TO_BOOKMARK = ".//div[contains[@data-l='outlandertarget,bookmarks,t,bookmarks']]";

  @FindBy(TO_BOOKMARK)
  AtlasWebElement goToBookmarks();
}
