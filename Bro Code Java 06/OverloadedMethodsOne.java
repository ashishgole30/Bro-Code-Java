public class OverloadedMethodsOne {
    public static void main(String[] args) {

        // Overloaded methods = methods that share the same name
        // but different parameters
        // signature = name + parameters

        System.out.println(add(1, 3, 4));
    }

    // same methods name but different paramters

    // 2 parameters
    static double add(double a, double b) {
        return a + b;
    }

    // 3 paramaters
    static double add(double a, double b, double c) {
        return a + b + c;
    }
}
