public class ForLoop1 {
    public static void main(String[] args) {

        // for loop = execute a block of code a CERTAIN number of times
        // for loop syntax
        // for (initialization; condition; increment/decrement) {
        // // code to be executed
        // }

        // counter variable generally i ; condition ; update the counter

        // print "hello" 10 times
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");

        }
        System.out.println("-------------------");
        // print numbers 1-10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------");
        // print numbers 10-1
        for (int i = 10; i > 0; i--) {
            System.out.println(i);

        }
        System.out.println("-------------------");
        // we can also increment by certain number
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("-------------------");

        // we can also decrement by certain number
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }
    }
}
