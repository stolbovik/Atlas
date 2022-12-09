package org.atlas.pagesFiles.pageElements;

import io.qameta.atlas.webdriver.extension.FindBy;

public interface WithNavigation {

    String TO_NAVIGATION = "//div[@id='hook_Block_SideNavigation']";

    @FindBy(TO_NAVIGATION)
    Navigation navigation();

}
