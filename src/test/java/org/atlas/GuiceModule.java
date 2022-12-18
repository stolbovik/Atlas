package org.atlas;

import com.google.inject.AbstractModule;
import org.atlas.Resources.UserInfo;
import org.atlas.Steps.BookmarksPageSteps;
import org.atlas.Steps.LoginPageSteps;
import org.atlas.Tests.BaseTest;
import org.jetbrains.annotations.NotNull;

public class GuiceModule extends AbstractModule {
    @NotNull
    private final BaseTest baseTest;
    @NotNull
    private final String NAME = "technoPol5 technoPol5";
    @NotNull
    private final String ID = "572238181118";

    public GuiceModule(@NotNull final BaseTest baseTest) {
        this.baseTest = baseTest;
    }

    @Override
    protected void configure() {
        bind(LoginPageSteps.class).toInstance(new LoginPageSteps(baseTest));
        bind(BookmarksPageSteps.class).toInstance(new BookmarksPageSteps(baseTest));
        bind(UserInfo.class).toInstance(new UserInfo(NAME, ID));
    }
}
