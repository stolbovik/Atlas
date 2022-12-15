package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.PageElements.GroupMainPanel;

public interface WithGroupMainPanel {
  String TO_MAIN_PANEL = "//div[@id='hook_Block_AltGroupMainMenu']";

  @FindBy(TO_MAIN_PANEL)
  GroupMainPanel groupMainPanel();
}
