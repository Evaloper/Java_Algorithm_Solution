public class MyVariableDemo {
    int instanceVariable = 6; //Belongs to this class and everything in the class
    static int variableStatic = 10; //Cannot be changed

    public void iMustLearnJava() {

        int localVariable = 2; // Can only be used within the method
        System.out.println(instanceVariable + variableStatic);
    }



}
