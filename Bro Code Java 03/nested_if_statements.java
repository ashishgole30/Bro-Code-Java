public class nested_if_statements {
    public static void main(String[] args) {

        // NESTED IF STATEMTNS

        // In Java it is possible to have if statements
        // within outher if statements

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a Senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            } else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }

        } else {
            if (isSenior) {
                System.out.println("You get a Senior discount of 20%");
                price *= 0.8;
            } else {
                price *= 1;
            }
        }
        System.out.printf("The price of a ticket is: $%.2f", price);
    }
}