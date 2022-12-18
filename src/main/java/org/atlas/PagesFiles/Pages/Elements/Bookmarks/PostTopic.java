package org.atlas.PagesFiles.Pages.Elements.Bookmarks;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

@SuppressWarnings("rawtypes")
public interface PostTopic extends AtlasWebElement {

    String TO_BUTTON_FOR_DELETE_BOOKMARK = "//a[contains(@class, 'mall-widget_item')]";

    @FindBy(TO_BUTTON_FOR_DELETE_BOOKMARK)
    AtlasWebElement buttonForDeleteBookmark();

}
