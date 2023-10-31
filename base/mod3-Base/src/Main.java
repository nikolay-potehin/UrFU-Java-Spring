import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user = getValue();
        serialize("cash.txt", user);
        System.out.println(deserialize("cash.txt").toString());
    }

    private static void serialize(String filename, User user) throws IOException {

        FileOutputStream out = new FileOutputStream(filename);
        ObjectOutputStream obj = new ObjectOutputStream(out);
        obj.writeObject(user);

        obj.close();
    }

    private static User deserialize(String filename) throws IOException, ClassNotFoundException {

        FileInputStream out = new FileInputStream(filename);
        ObjectInputStream obj = new ObjectInputStream(out);
        User user1 = (User) obj.readObject();

        return user1;
    }

    private static User getValue(){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = in.nextLine();

        System.out.println("Введите логин:");
        String login = in.nextLine();

        System.out.println("Введите хобби (через пробел):");
        String hobbiString = in.nextLine();

        ArrayList<String> hobbi = new ArrayList<>(Arrays.asList(hobbiString.split(" ")));

        System.out.println("Введите возраст:");
        int age = in.nextInt();

        return new User(name, login, age, hobbi);
    }
}