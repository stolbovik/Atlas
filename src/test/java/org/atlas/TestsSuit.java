package org.atlas;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@IncludeTags({"video_bookmark"})
@Suite
@SelectPackages({"org.atlas.tests"})
@SuiteDisplayName("Тест раздела 'Закладки'")
public class TestsSuit {

}