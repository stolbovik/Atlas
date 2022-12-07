package org.atlas.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.elements.WithToolbar;

@SuppressWarnings("rawtypes")
public interface UserPage extends WebPage, WithToolbar {
  @FindBy(".//div[contains[@data-l='outlandertarget,bookmarks,t,bookmarks']")
  AtlasWebElement goToBookmarks();
}
