package org.atlas.pagesFiles.pages;

import io.qameta.atlas.webdriver.WebPage;
import org.atlas.pagesFiles.withElements.WithBookmarksMenuPanel;
import org.atlas.pagesFiles.withElements.WithBookmarksVideoList;
import org.atlas.pagesFiles.withElements.WithToolbar;

public interface BookmarksPage extends  WebPage,
                                        WithToolbar,
                                        WithBookmarksMenuPanel,
                                        WithBookmarksVideoList {



}
