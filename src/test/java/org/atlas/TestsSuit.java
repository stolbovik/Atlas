package org.atlas;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@IncludeTags({"bookmark"})
@Suite
@SelectPackages({"org.atlas.tests"})
@SuiteDisplayName("All Tests Suite")
public class TestsSuit {

}