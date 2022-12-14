package org.atlas.PagesFiles.Sites;

import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;
import io.qameta.atlas.webdriver.extension.Path;
import org.atlas.PagesFiles.Pages.*;

public interface OkSite extends WebSite {
    @Page
    LoginPage onLoginPage();

    @Page(url = "/feed")
    FeedPage onFeedPage();

    @Page(url = "/video/showcase")
    VideoPage onVideoPage();

    @Page(url = "/bookmarks")
    BookmarksPage onBookmarksPage();

    @Page(url = "/profile/{data}/groups")
    UserGroupsPage onGroupsPage(@Path("data") String data);

    @Page(url = "/ok")
    GroupPage onGroupPage();

    @Page(url = "/profile/{data}")
    UserPage onUserPage(@Path("data") String data);
}
