package org.atlas.PagesFiles.Pages.Elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

@SuppressWarnings("rawtypes")
public interface Toolbar extends AtlasWebElement {
  String TO_ACTION_LINK = "//ul[@class='toolbar_nav']//a[@aria-label='{{ data }}']";
  String SEARCH_FIELD = "//*[@name='st.query']";

  @FindBy(TO_ACTION_LINK)
  AtlasWebElement actionLink(@Param("data") String data);

  @FindBy(SEARCH_FIELD)
  AtlasWebElement searchField();

}
