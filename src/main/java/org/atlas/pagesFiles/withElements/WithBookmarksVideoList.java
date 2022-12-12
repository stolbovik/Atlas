package org.atlas.pagesFiles.withElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.pagesFiles.pageElements.BookmarksVideoList;
import org.atlas.pagesFiles.pageElements.Navigation;

public interface WithBookmarksVideoList {

    String TO_LIST_OF_BOOKMARKS_VIDEO = "//div[contains(@class, 'bookmarks-movie-list')]";

    @FindBy(TO_LIST_OF_BOOKMARKS_VIDEO)
    BookmarksVideoList videos();

}
