package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.Bookmarks.BookmarksGroupList;

public interface WithBookmarksGroupsList {

    String TO_LIST_OF_GROUPS = "//div[contains(@class, 'bookmarks-user-group-list')]";

    @FindBy(TO_LIST_OF_GROUPS)
    BookmarksGroupList groups();
}
