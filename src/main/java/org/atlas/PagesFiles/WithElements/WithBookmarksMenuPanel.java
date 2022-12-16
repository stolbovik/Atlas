package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.Bookmarks.BookmarksMenuPanel;

public interface WithBookmarksMenuPanel {

    String TO_BOOKMARKS_MENU_PANEL = "//div[@id='bookmarksMenuPanel']";

    @FindBy(TO_BOOKMARKS_MENU_PANEL)
    BookmarksMenuPanel bookmarksMenuPanel();

}
