package org.atlas.pagesFiles.withElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.pagesFiles.pageElements.ThirdMenuSection;

public interface WithThirdMenuSection {

    String TO_THIRD_MENU_SECTION = "//div[@id='hook_Block_LeftColumnThirdMenuSection']";

    @FindBy(TO_THIRD_MENU_SECTION)
    ThirdMenuSection thirdMenuSection();
}
