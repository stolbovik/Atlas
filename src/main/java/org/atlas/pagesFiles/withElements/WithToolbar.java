package org.atlas.pagesFiles.withElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.pagesFiles.pageElements.Toolbar;

public interface WithToolbar {

  String TO_TOOLBAR = "//div[@class='toolbar_c']";

  @FindBy(TO_TOOLBAR)
  Toolbar toolbar();

}
