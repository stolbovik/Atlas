package org.atlas.pagesFiles.sites;

import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;
import org.atlas.pagesFiles.pages.BookmarksPage;
import org.atlas.pagesFiles.pages.LoginPage;
import org.atlas.pagesFiles.pages.LentaPage;
import org.atlas.pagesFiles.pages.VideoPage;

public interface OkSite extends WebSite {
  @Page
  LoginPage onLoginPage();
  @Page(url = "/feed")
  LentaPage onLentaPage();
  @Page(url = "/video/showcase")
  VideoPage onVideoPage();
  @Page(url = "/bookmarks")
  BookmarksPage onBookmarksPage();

}
