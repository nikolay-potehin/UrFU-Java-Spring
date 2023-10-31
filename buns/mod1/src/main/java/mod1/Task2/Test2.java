package mod1.Task2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applContext2.xml");

        Person2 person2 = context.getBean("PersonBean", Person2.class);
        person2.callYourPet();

//        Dog2 dog2 = context.getBean("DogBean", Dog2.class);
//        dog2.say();

        context.close();
    }
}
