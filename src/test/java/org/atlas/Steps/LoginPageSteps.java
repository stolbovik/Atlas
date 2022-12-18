package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.LoginPage;
import org.atlas.Resources.TestBot;
import org.atlas.Tests.BaseTest;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("FieldCanBeLocal")
public class LoginPageSteps {
    @NotNull
    private final BaseTest TEST;
    private TestBot testBot;
    @NotNull
    private final String EMAIL_INPUT = "st.email";
    @NotNull
    private final String PASSWORD_INPUT = "st.password";
    @NotNull
    private final String SIGN_IN_BUTTON = "login-form-actions";
    @NotNull
    private final LoginPage LOGIN_PAGE;

    public LoginPageSteps(@NotNull final BaseTest test) {
        this.TEST = test;
        this.LOGIN_PAGE = TEST.getSite().onLoginPage();
    }

    public FeedPageSteps loginIn(@NotNull final TestBot testBot) {
        this.testBot = testBot;
        LOGIN_PAGE.input(EMAIL_INPUT).sendKeys(this.testBot.getLogin());
        LOGIN_PAGE.input(PASSWORD_INPUT).sendKeys(this.testBot.getPassword());
        LOGIN_PAGE.button(SIGN_IN_BUTTON).click();
        return new FeedPageSteps(TEST);
    }
}
