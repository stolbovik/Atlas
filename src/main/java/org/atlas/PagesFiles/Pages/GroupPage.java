package org.atlas.PagesFiles.Pages;

import io.qameta.atlas.webdriver.WebPage;
import org.atlas.PagesFiles.WithElements.WithGroupMainPanel;
import org.atlas.PagesFiles.WithElements.WithNavigation;
import org.atlas.PagesFiles.WithElements.WithThirdMenuSection;
import org.atlas.PagesFiles.WithElements.WithToolbar;

public interface GroupPage extends WebPage,
    WithToolbar,
    WithNavigation,
    WithThirdMenuSection,
    WithGroupMainPanel {

}
