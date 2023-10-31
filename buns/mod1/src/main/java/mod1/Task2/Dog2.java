package mod1.Task2;

import org.springframework.stereotype.Component;

@Component("DogBean")
public class Dog2 implements Pet2 {
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
