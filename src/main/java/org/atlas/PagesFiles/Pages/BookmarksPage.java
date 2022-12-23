package org.atlas.PagesFiles.Pages;

import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.Toolbar;
import org.atlas.PagesFiles.WithElements.*;

public interface BookmarksPage extends WebPage,
    WithToolbar,
    WithBookmarksMenuPanel,
    WithBookmarksVideoList,
    WithBookmarksGroupsList,
    WithBookmarksPostsList,
    WithMediaPlayer,
    WithPostTopic,
    WithBookmarksUsersList {

    String EMPTY_BOOKMARK_PAGE = "//*[@class='stub-empty __v2 zeroTopBorderRadius ']";

    @FindBy(EMPTY_BOOKMARK_PAGE)
    Toolbar emptyBlock();
}
