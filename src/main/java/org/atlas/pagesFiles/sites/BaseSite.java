package org.atlas.pagesFiles.sites;

import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;
import org.atlas.pages.LoginPage;
import org.atlas.pages.UserPage;

public interface BaseSite extends WebSite {
  @Page
  UserPage onUserPage();
  @Page
  LoginPage onLoginPage();

}
