public class OverloadedMethodsTwo {
    public static void main(String[] args) {
        /*
         * // Overloaded methods = methods that share the same name
         * // but different parameters
         * // signature = name + parameters
         */

        String pizzaOne = bakePizza("flat bread");
        System.out.println(pizzaOne);

        String pizzaTwo = bakePizza("flat bread", "Mozarella");
        System.out.println(pizzaTwo);

        String pizzaThree = bakePizza("flat bread", "Mozarella", "pepperoni");
        System.out.println(pizzaThree);
    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }

}
