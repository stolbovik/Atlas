package org.atlas.PagesFiles.Pages;

import io.qameta.atlas.webdriver.WebPage;
import org.atlas.PagesFiles.WithElements.WithNavigation;
import org.atlas.PagesFiles.WithElements.WithThirdMenuSection;
import org.atlas.PagesFiles.WithElements.WithToolbar;
import org.atlas.PagesFiles.WithElements.WithUserMenuPanel;

public interface UserPage extends WebPage,
    WithToolbar,
    WithNavigation,
    WithThirdMenuSection,
    WithUserMenuPanel {

}
