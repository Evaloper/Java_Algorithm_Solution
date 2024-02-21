package animalApp;

public class Animal {
    String name;

    public  Animal(){

    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound(){
        System.out.println(name + " Roar Roar");

    }
}
