package org.atlas.Resources;

public class TestBot {

    private final String LOGIN;
    private final String PASSWORD;

    public TestBot(String login, String password) {
        this.LOGIN = login;
        this.PASSWORD = password;
    }

    public String getLogin() {
        return this.LOGIN;
    }

    public String getPassword() {
        return this.PASSWORD;
    }
}
