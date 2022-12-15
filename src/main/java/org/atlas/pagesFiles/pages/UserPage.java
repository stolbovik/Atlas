package org.atlas.pagesFiles.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;
import org.atlas.pagesFiles.pageElements.WithToolbar;

@SuppressWarnings("rawtypes")
public interface UserPage extends WebPage, WithToolbar {

  String ADDITIONAL_SECTION = "//li[@class='u-menu_li  __custom']//*[contains (text(), '{{ text }}')]/../..";

  @FindBy(ADDITIONAL_SECTION)
  AtlasWebElement goToAdditionalSection(@Param("text") String text);
}
