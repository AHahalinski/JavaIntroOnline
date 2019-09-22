package by.bemn.java_intro_online.lesson06_tasks.task1.entity.user;

public class User {
    private String login;
    private String password;
    private String email;
    private boolean isAdmin;

    public User(String login, String password, String email, boolean isAdmin) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.isAdmin = isAdmin;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    @Override
    public String toString() {
        return String.format(login + "\t" + password + "\t" + email + "\t" + isAdmin+"\n");
    }
}
