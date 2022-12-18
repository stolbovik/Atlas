package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.Bookmarks.PostTopic;

public interface WithPostTopic {

    String TO_POST_TOPIC = "//div[@id='hook_Block_MediaTopicLayerBody']";

    @FindBy(TO_POST_TOPIC)
    PostTopic postTopic();

}
