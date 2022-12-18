package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.Bookmarks.BookmarksUsersList;

public interface WithBookmarksUsersList {

    String TO_LIST_OF_USERS = "//div[contains(@class, 'bookmarks-user-group-list')]";

    @FindBy(TO_LIST_OF_USERS)
    BookmarksUsersList users();
}
