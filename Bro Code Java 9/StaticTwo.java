public class StaticTwo {
    public static void main(String[] args) {

        // static = static keyword makes a variable or method
        // belong to the class
        // rather than to any specific object
        // commonly used for utiliy methods or shared resouces

        // We can see static keyword also in our main method
        // public STATIC void main

        // round is a utility method
        // round is static method
        // we access it throught the class name (Math)
        // You dont need to create an math object

        System.out.println(Math.round(3.99));
    }

}
