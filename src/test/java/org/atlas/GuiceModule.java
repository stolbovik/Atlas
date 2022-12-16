package org.atlas;

import com.google.inject.AbstractModule;
import org.atlas.Steps.BookmarksPageSteps;
import org.atlas.Steps.LoginPageSteps;
import org.atlas.Tests.BaseTest;

public class GuiceModule extends AbstractModule {
  private final BaseTest baseTest;

  public GuiceModule(final BaseTest baseTest) {
    this.baseTest = baseTest;
  }

  @Override
  protected void configure() {
    bind(LoginPageSteps.class).toInstance(new LoginPageSteps(baseTest));
    bind(BookmarksPageSteps.class).toInstance(new BookmarksPageSteps(baseTest));
  }
}
