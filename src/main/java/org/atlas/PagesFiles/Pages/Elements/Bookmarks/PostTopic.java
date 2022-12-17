package org.atlas.PagesFiles.Pages.Elements.Bookmarks;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface PostTopic extends AtlasWebElement {

    String TO_BUTTON_FOR_DELETE_BOOKMARK = "//a[contains(@title, 'Добавить в закладки')]";

    @FindBy(TO_BUTTON_FOR_DELETE_BOOKMARK)
    AtlasWebElement buttonForDeleteBookmark();

}
