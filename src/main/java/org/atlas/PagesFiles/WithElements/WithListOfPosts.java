package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.Feed.ListOfPosts;

public interface WithListOfPosts {

    String TO_LIST_OF_POSTS = "//div[@class='main-feed portlet']";

    @FindBy(TO_LIST_OF_POSTS)
    ListOfPosts listOfPosts();

}
