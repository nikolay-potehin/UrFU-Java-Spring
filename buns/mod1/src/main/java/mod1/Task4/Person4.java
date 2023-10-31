package mod1.Task4;

public class Person4 {
    private Pet4 pet4;

    public Person4(Pet4 pet4) {
        this.pet4 = pet4;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet");
        pet4.say();
    }
}
