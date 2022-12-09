package org.atlas.pagesFiles.pageElements;

import io.qameta.atlas.webdriver.extension.FindBy;

public interface WithToolbar {

  String TO_TOOLBAR = "//div[@class='toolbar_c']";

  @FindBy(TO_TOOLBAR)
  Toolbar toolbar();

}
