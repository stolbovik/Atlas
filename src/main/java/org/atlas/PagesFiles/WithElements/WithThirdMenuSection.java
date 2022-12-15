package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.PageElements.ThirdMenuSection;

public interface WithThirdMenuSection {

    String TO_THIRD_MENU_SECTION = "//div[@id='hook_Block_LeftColumnThirdMenuSection']";

    @FindBy(TO_THIRD_MENU_SECTION)
    ThirdMenuSection thirdMenuSection();
}
