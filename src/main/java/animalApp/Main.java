package animalApp;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Bingo");
        Animal dog = new Animal("Woaf Woaf");
        Cat myCat = new Cat("Pussy");


        myDog.overRide("Buddy");
        myDog.fetchBall("Bingo");
        System.out.println("My dog barks " + dog.name);
        myCat.catSound();



    }
}
