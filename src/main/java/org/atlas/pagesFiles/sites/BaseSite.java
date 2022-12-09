package org.atlas.pagesFiles.sites;

import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;
import org.atlas.pagesFiles.pages.LoginPage;
import org.atlas.pagesFiles.pages.LentaPage;

public interface BaseSite extends WebSite {
  @Page
  LentaPage onLentaPage();
  @Page
  LoginPage onLoginPage();

}
