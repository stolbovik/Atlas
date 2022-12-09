package org.atlas.pagesFiles.pageElements;

import io.qameta.atlas.webdriver.extension.FindBy;

public interface WithThirdMenuSection {

    String TO_THIRD_MENU_SECTION = "//div[@id='hook_Block_LeftColumnThirdMenuSection']";

    @FindBy(TO_THIRD_MENU_SECTION)
    ThirdMenuSection thirdMenuSection();
}
