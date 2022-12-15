package org.atlas.PagesFiles.Pages;

import io.qameta.atlas.webdriver.WebPage;
import org.atlas.PagesFiles.WithElements.WithBookmarksGroupsList;
import org.atlas.PagesFiles.WithElements.WithBookmarksMenuPanel;
import org.atlas.PagesFiles.WithElements.WithBookmarksVideoList;
import org.atlas.PagesFiles.WithElements.WithToolbar;

public interface BookmarksPage extends WebPage,
  WithToolbar,
  WithBookmarksMenuPanel,
  WithBookmarksVideoList,
  WithBookmarksGroupsList {


}
