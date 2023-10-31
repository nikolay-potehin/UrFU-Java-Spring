import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    private String name;
    private String login;
    private int age;
    private ArrayList<String> hobbi;

    public User(String name, String login, int age, ArrayList<String> hobbi) {
        this.name = name;
        this.login = login;
        this.age = age;
        this.hobbi = hobbi;
    }

    @Override
    public String toString() {
        return "Пользователь:\n" +
                "   Имя: " + name + '\n' +
                "   Логин: " + login + '\n' +
                "   Возраст: " + age + '\n' +
                "   Хобби: " + hobbi.toString().replaceAll("^\\[|\\]$", "");
    }
}
