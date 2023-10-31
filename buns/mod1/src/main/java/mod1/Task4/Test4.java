package mod1.Task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig4.class);

        Person4 person4 = context.getBean("PersonBean", Person4.class);

        person4.callYourPet();
    }
}
