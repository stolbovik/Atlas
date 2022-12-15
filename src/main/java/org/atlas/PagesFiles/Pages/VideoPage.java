package org.atlas.PagesFiles.Pages;

import io.qameta.atlas.webdriver.WebPage;
import org.atlas.PagesFiles.WithElements.WithNavigation;
import org.atlas.PagesFiles.WithElements.WithThirdMenuSection;
import org.atlas.PagesFiles.WithElements.WithToolbar;
import org.atlas.PagesFiles.WithElements.WithVideoTopList;

public interface VideoPage extends  WebPage,
                                    WithNavigation,
                                    WithToolbar,
                                    WithThirdMenuSection,
                                    WithVideoTopList {

}
