public class ExceptionHandlingOne {
    public static void main(String[] args) {

        // Exception = An even that interrupts the normal flow of a program
        // (Dividing by zero , file not found , mismatch input type)
        // Surround any dangerous code with a try{} block
        // try{} , catch {} , finally{}
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println("YOU CANT DIVIDE BY ZERO!");
        }
    }
}