package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.Navigation;

public interface WithNavigation {

    String TO_NAVIGATION = "//div[@id='hook_Block_SideNavigation']";

    @FindBy(TO_NAVIGATION)
    Navigation navigation();

}
