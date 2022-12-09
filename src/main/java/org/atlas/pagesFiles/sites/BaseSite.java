package org.atlas.pagesFiles.sites;

import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;
import org.atlas.pagesFiles.pages.LoginPage;
import org.atlas.pagesFiles.pages.UserPage;

public interface BaseSite extends WebSite {
  @Page
  UserPage onUserPage();
  @Page
  LoginPage onLoginPage();

}
