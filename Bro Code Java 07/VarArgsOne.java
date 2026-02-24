public class VarArgsOne {
    public static void main(String[] args) {

        // varargs = allow a method to accept a varying number of arguments
        // makes methods more flexible , no need for overloaded methods
        // Java will pack the arguments into an array
        // ... (ellipsis)

        System.out.println(add(1, 2, 3, 4, 6, 53, 2));
    }

    static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        // for every number in my array of numbers, add it to sum
        return sum;
    }
}
