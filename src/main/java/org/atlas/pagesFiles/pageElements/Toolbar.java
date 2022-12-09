package org.atlas.pagesFiles.pageElements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

@SuppressWarnings("rawtypes")
public
interface Toolbar extends AtlasWebElement {

  String TO_ACTION_LINK = ".//*[@class='toolbar_nav']//li[contains(aria-label,'{{data}}')]";

  @FindBy(TO_ACTION_LINK)
  AtlasWebElement actionLink(@Param("data") String data);
}
