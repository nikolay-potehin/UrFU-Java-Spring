package mod1.Task1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applContext1.xml");

        Person1 person1 = context.getBean("myPerson1", Person1.class);
        person1.callYourPet();

        context.close();
    }
}
