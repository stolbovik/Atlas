package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.Toolbar;

public interface WithToolbar {

    String TO_TOOLBAR = "//div[@class='toolbar_c']";

    @FindBy(TO_TOOLBAR)
    Toolbar toolbar();

}
