package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.BookmarksPage;
import org.atlas.Tests.BaseTest;

public class BookmarksPageSteps {

    private final BaseTest TEST;
    private final BookmarksPage bookmarksPage;
    public final String MOVIES = "movies";

    public BookmarksPageSteps(BaseTest test) {
        this.TEST = test;
        this.bookmarksPage = this.TEST.getSite().onBookmarksPage();
    }

    public BookmarksPageSteps goToVideoBookmarks() {
        bookmarksPage.bookmarksMenuPanel().bookmarks(MOVIES).click();
        return this;
    }

    public BookmarksPageSteps getHrefFirstVideo(StringBuilder href) {
        href.append(bookmarksPage.videos().firstVideo().getAttribute("href"));
        return this;
    }
}
