package org.atlas.PagesFiles.Pages;

import io.qameta.atlas.webdriver.WebPage;
import org.atlas.PagesFiles.WithElements.WithListOfPosts;
import org.atlas.PagesFiles.WithElements.WithNavigation;
import org.atlas.PagesFiles.WithElements.WithThirdMenuSection;
import org.atlas.PagesFiles.WithElements.WithToolbar;

public interface FeedPage extends WebPage,
  WithToolbar,
  WithNavigation,
  WithThirdMenuSection,
  WithListOfPosts {

}
