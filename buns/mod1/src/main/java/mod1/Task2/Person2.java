package mod1.Task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("PersonBean")
public class Person2 {
    private Pet2 pet2;

    @Autowired
    public void setPet2(Pet2 pet2) {
        this.pet2 = pet2;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet");
        pet2.say();
    }
}
