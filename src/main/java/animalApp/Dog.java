package animalApp;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    public void overRide( String name){
        System.out.println(name + " makes Woof Woof");
    }

    public void fetchBall(String name){
        System.out.println(name + " is fetching ball. ");
    }
}
