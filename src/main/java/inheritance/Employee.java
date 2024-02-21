package inheritance;

public class Employee {
    private float salary;

    public Employee(){

    }

    public Employee(float salary){
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
