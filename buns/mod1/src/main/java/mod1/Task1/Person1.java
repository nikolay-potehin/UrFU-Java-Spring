package mod1.Task1;

public class Person1 {
    private Pet1 pet1;

    public void setPet1(Pet1 pet1) {
        this.pet1 = pet1;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet");
        pet1.say();
    }
}
