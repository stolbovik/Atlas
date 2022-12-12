package org.atlas.pagesFiles.withElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.pagesFiles.pageElements.BookmarksMenuPanel;

public interface WithBookmarksMenuPanel {

    String TO_BOOKMARKS_MENU_PANEL = "//div[@id='bookmarksMenuPanel']";

    @FindBy(TO_BOOKMARKS_MENU_PANEL)
    BookmarksMenuPanel bookmarksMenuPanel();

}
