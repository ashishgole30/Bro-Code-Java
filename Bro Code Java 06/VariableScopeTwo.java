public class VariableScopeTwo {

    static int x = 3; // CLASS Variable scope

    public static void main(String[] args) {

        // Variable Scope = where a variable can be accessed

        // 2. Class Variable = is declared inside of a class but not within any methods
        // they are recognized within the entire class
        System.out.println(x);
        // main method can see the variable x = 3

        doSomething();
    }

    // This doSomething method can also seee the variable x = 3
    static void doSomething() {
        System.out.println(x);
    }
}
