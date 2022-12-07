package org.atlas.elements;

import io.qameta.atlas.webdriver.extension.FindBy;

public interface WithToolbar {
  @FindBy(".//div[@class='toolbar_c']")
  Toolbar toolbar();
}
