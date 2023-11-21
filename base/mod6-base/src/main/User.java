package main;

public class User {
    public String login;
    public String email;

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
