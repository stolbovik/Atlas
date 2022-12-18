package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.User.UserMainPanel;

public interface WithUserMenuPanel {

    String TO_USER_MENU_PANEL = "//div[@id='hook_Block_MainMenu']";

    @FindBy(TO_USER_MENU_PANEL)
    UserMainPanel userMainPanel();

}
