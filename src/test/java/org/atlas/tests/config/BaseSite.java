package org.atlas.tests.config;

import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;
import org.atlas.pages.UserPage;

public interface BaseSite extends WebSite {
  @Page
  UserPage onUserPage();

}
