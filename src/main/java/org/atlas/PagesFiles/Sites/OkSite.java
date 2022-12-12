package org.atlas.PagesFiles.Sites;

import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;
import org.atlas.PagesFiles.Pages.BookmarksPage;
import org.atlas.PagesFiles.Pages.LoginPage;
import org.atlas.PagesFiles.Pages.LentaPage;
import org.atlas.PagesFiles.Pages.VideoPage;

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
