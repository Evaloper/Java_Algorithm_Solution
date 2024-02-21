package animalApp;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    public void catSound(){
        System.out.println(name + " is a cat and she meows");
    }
}
