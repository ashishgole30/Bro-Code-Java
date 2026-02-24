public class MethodsTwo {
    public static void main(String[] args) {

        // method = a block of code that is executed whenever it is called ()

        // Why are methods used?
        // 1. To reuse code , just call the method
        // 2. To make code more organized and readable

        // what if we want to reuse the code?
        // we can create a method

        // method call syntax
        // methodName(arguments);

        String name = "Bro Code";
        int age = 21;

        // calling the method with arguments
        happyBirthday(name, age);

    }

    // Outside main method
    // static and void are keywords

    // method declration syntax
    // static void methodName(parameter1, parameter2) {
    // // code to be executed
    // }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday " + name);
        System.out.println("Hello " + name + " , Its your birthday");
        System.out.println("You are now " + age + " years old");
        System.out.println("Happy Birthday " + name + "\n");
    }

    // One thing to remember about methods is that
    // they are unfamiliar with any variables declared inside another methods

    // so we declared two variables inside main method ie name and age
    // we cannot use them inside happyBirthday method directly like
    // System.out.println("Happy Birthday " + name);
    // because happyBirthday method is unfamiliar with name and age variables

    // so we use arguments to pass the values or variables
    // but in order to receive those values we need to use parameters
    // the parameters list the data types and variable names

    // the names of the parameters can be different from the names of the arguments
    // but order and data types must be the same
}
