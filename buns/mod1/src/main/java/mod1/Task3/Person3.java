package mod1.Task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("PersonBean")
public class Person3 {
    private Pet3 pet3;

    @Autowired
    public void setPet2(Pet3 pet3) {
        this.pet3 = pet3;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet");
        pet3.say();
    }
}
