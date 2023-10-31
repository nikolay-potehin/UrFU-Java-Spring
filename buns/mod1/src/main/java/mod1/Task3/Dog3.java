package mod1.Task3;

import org.springframework.stereotype.Component;

@Component("DogBean")
public class Dog3 implements Pet3 {
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
