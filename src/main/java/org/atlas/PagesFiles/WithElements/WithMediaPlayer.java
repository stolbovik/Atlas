package org.atlas.PagesFiles.WithElements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.atlas.PagesFiles.Pages.Elements.MediaPlayer;

public interface WithMediaPlayer {

    String TO_MEDIA_PLAYER = "//div[@class='media-layer_c']";

    @FindBy(TO_MEDIA_PLAYER)
    MediaPlayer toMediaPlayer();

}
