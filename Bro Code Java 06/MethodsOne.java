public class MethodsOne {
    public static void main(String[] args) {

        // method = a block of code that is executed whenever it is called ()

        // Why are methods used?
        // 1. To reuse code , just call the method
        // 2. To make code more organized and readable

        /*
         * System.out.println("Happy Birthday Bro Code");
         * System.out.println("Hello Bro Code , Its your birthday");
         * System.out.println("You are now 1 year older Bro Code");
         * System.out.println("Happy Birthday Bro Code\n");
         */

        // what if we want to reuse the code?
        // we can create a method

        // method call syntax
        // methodName();

        // calling the method for the first time
        happyBirthday();
        // calling the method again for the second time
        happyBirthday();
        // calling the method again for the third time
    }

    // Outside main method
    // static and void are keywords

    // method declration syntax
    // static void methodName() {
    // // code to be executed
    // }

    static void happyBirthday() {
        System.out.println("Happy Birthday Bro Code");
        System.out.println("Hello Bro Code , Its your birthday");
        System.out.println("You are now 1 year older Bro Code");
        System.out.println("Happy Birthday Bro Code\n");
    }
}
