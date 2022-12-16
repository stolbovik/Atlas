package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.Bookmarks.BookmarksVideoList;

public interface WithBookmarksVideoList {

    String TO_LIST_OF_BOOKMARKS_VIDEO = "//div[contains(@class, 'bookmarks-movie-list')]";

    @FindBy(TO_LIST_OF_BOOKMARKS_VIDEO)
    BookmarksVideoList videos();

}
