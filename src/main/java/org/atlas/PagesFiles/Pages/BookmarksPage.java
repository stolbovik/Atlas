package org.atlas.PagesFiles.Pages;

import io.qameta.atlas.webdriver.WebPage;
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

}
