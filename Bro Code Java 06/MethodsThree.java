public class MethodsThree {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon()
        double result = square(3);
        System.out.println(result);

        System.out.println(square(6));
    }

    // Method to square a number and return the result
    // since we are returning a double value, we use double as the return type
    // static keyword needed to call the method from static main method

    static double square(double number) {
        return number * number;
    }
}
