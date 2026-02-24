public class VarArgsTwo {
    public static void main(String[] args) {

        // varargs = allow a method to accept a varying number of arguments
        // makes methods more flexible , no need for overloaded methods
        // Java will pack the arguments into an array
        // ... (ellipsis)

        System.out.println(average(1, 2, 3, 4, 5));

    }

    static double average(double... numbers) {

        double sum = 0;

        if (numbers.length == 0) {
            return 0;
        }

        for (double number : numbers) {
            sum = sum + number;
        }
        return sum / numbers.length;

    }
}
