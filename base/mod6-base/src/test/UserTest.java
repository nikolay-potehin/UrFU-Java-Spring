package test;

import main.User;
import org.junit.Test;

public class UserTest {

    @Test
    public void testUserWithArg() {
        String login = "Ruslan";
        String email = "r@.ru";
        User user = new User(login, email);

        String userLogin = user.getLogin();
        String userEmail = user.getEmail();

        assert  userLogin == login & userEmail == email : "Does not creat with arg!!!";
    }

    @Test
    public void testUserWithoutArg() {
        String login = null;
        String email = null;

        User user = new User();

        String userLogin = user.getLogin();
        String userEmail = user.getEmail();

        assert  userLogin == login & userEmail == email : "Does not creat without arg!!!";
    }

    @Test
    public void testCorrectEmail() {
     User user = new User("Ruslan", "r@mail.ru");

        String userEmail = user.getEmail();

        assert  userEmail.contains("@") | userEmail.contains("."): "Email without '@' or '.'!!!";
    }

    @Test
    public void testCorrectLogin() {
        User user = new User("Ruslan", "r@mail.ru");

        String userLogin = user.getLogin();

        assert  userLogin.length() >= 5: "Login < 5!!!";
    }
}
