package org.atlas.Resources;

public class TestBot {

  private final String LOGIN;
  private final String PASSWORD;
  private final String ID;

  public TestBot(final String login, final String password, final String id) {
    this.LOGIN = login;
    this.PASSWORD = password;
    this.ID = id;
  }

  public String getLogin() {
    return this.LOGIN;
  }

  public String getPassword() {
    return this.PASSWORD;
  }
}
