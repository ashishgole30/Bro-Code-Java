public class VariableScopeOne {
    public static void main(String[] args) {

        // Variable Scope = where a variable can be accessed

        // 1. LOCAL
        // Inside of a method , if you declare a variable it has a LOCAL scope

        int x = 1; // Local variable
        System.out.println(x); // x = 1

        doSomething(); // x = 2
    }

    static void doSomething() {
        int x = 2; // Local variable
        System.out.println(x);

        // You can have variables with the same name as long as they are within
        // different methods
    }
}
