package org.atlas;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@IncludeTags({"video_bookmark", "group_bookmark", "post_bookmark", "user_bookmark"})
@Suite
@SelectPackages({"org.atlas.Tests"})
@SuiteDisplayName("Тест раздела 'Закладки'")
public class TestsSuit {

}