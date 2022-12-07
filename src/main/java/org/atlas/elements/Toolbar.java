package org.atlas.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

@SuppressWarnings("rawtypes")
public
interface Toolbar extends AtlasWebElement {
  @FindBy(".//*[@class='toolbar_nav'].//li[contains(aria-label,'{{data}}')]")
  AtlasWebElement actionLink(@Param("data") String data);
}
