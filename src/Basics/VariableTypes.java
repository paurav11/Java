package Basics;

public class VariableTypes {
    // A variable whose single copy can be shared with all the instances of a class is a static variable
    static int staticVariable = 15; // It cannot be local and instance variable

    void method() {
        // A variable declared inside a method is called a local variable
        int localVariable = 11; // It cannot be declared with static keyword
        System.out.println(localVariable);
//        System.out.println(instanceVariable);
//        System.out.println(staticVariable);
    }

    public static void main(String[] args) {
        // A variable declared outside a method is called an instance variable
        int instanceVariable = 50; // It cannot be declared with static keyword
        System.out.println(instanceVariable);

        // System.out.println(localVariable);
        VariableTypes variableTypes = new VariableTypes();
        variableTypes.method();

        System.out.println(staticVariable);
        A a = new A();
        a.printStaticVariable();
        System.out.println(staticVariable);
    }
}

class A {
    void printStaticVariable() {
        // Incrementing static variable value
        ++VariableTypes.staticVariable;
        System.out.println(VariableTypes.staticVariable);
//        System.out.println(VariableTypes.instanceVariable);
//        System.out.println(VariableTypes.localVariable);
    }
}
