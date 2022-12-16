package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.Bookmarks.BookmarksGroupList;

public interface WithBookmarksGroupsList {

    String TO_LIST_OF_GROUPS_VIDEO = "//div[contains(@class, 'bookmarks-user-group-list js-bookmarks-grid')]";

    @FindBy(TO_LIST_OF_GROUPS_VIDEO)
    BookmarksGroupList groups();
}
