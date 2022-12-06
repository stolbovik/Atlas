package org.atlas;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectPackages({"org.atlas.tests"})
@IncludeTags({"development"})
@Suite
@SuiteDisplayName("All Tests Suite")
public class TestSuit {

}