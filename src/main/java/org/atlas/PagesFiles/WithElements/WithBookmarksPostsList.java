package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.Bookmarks.BookmarksPostsList;
import org.atlas.PagesFiles.Pages.Elements.Bookmarks.BookmarksVideoList;

public interface WithBookmarksPostsList {

    String TO_LIST_OF_BOOKMARKS_POST = "//div[contains(@class, 'bookmarks-feed-list')]";

    @FindBy(TO_LIST_OF_BOOKMARKS_POST)
    BookmarksPostsList posts();

}
