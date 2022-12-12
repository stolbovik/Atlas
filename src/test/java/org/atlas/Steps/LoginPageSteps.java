package org.atlas.Steps;

import org.atlas.PagesFiles.Pages.LoginPage;
import org.atlas.Resources.TestBot;
import org.atlas.Tests.BaseTest;

public class LoginPageSteps {

    private final BaseTest TEST;
    private TestBot testBot;
    private final String EMAIL_INPUT = "st.email";
    private final String PASSWORD_INPUT = "st.password";
    private final String SIGN_IN_BUTTON = "login-form-actions";
    private final LoginPage loginPage;

    public LoginPageSteps(BaseTest test) {
        this.TEST = test;
        this.loginPage = TEST.getSite().onLoginPage();
    }

    public LoginPageSteps loginIn(TestBot testBot) {
        this.testBot = testBot;
        loginPage.input(EMAIL_INPUT). sendKeys(this.testBot.getLogin());
        loginPage.input(PASSWORD_INPUT).sendKeys(this.testBot.getPassword());
        loginPage.button(SIGN_IN_BUTTON).click();
        return this;
    }

}
