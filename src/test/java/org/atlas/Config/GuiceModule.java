package org.atlas.Config;

import com.google.inject.AbstractModule;
import org.atlas.Steps.LoginPageSteps;
import org.atlas.TestResources.UserInfo;
import org.atlas.Tests.BaseTest;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("FieldCanBeLocal")
public class GuiceModule extends AbstractModule {
    @NotNull
    private final BaseTest baseTest;
    private final String NAME = "technoPol5 technoPol5";
    private final String ID = "572238181118";

    public GuiceModule(@NotNull final BaseTest baseTest) {
        this.baseTest = baseTest;
    }

    @Override
    protected void configure() {
        bind(LoginPageSteps.class).toInstance(new LoginPageSteps(baseTest));
        bind(UserInfo.class).toInstance(new UserInfo(NAME, ID));
    }
}
