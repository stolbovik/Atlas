package org.atlas.pagesFiles.pages;

import io.qameta.atlas.webdriver.WebPage;
import org.atlas.pagesFiles.withElements.WithNavigation;
import org.atlas.pagesFiles.withElements.WithThirdMenuSection;
import org.atlas.pagesFiles.withElements.WithToolbar;
import org.atlas.pagesFiles.withElements.WithVideoTopList;

public interface VideoPage extends  WebPage,
                                    WithNavigation,
                                    WithToolbar,
                                    WithThirdMenuSection,
                                    WithVideoTopList {


}
