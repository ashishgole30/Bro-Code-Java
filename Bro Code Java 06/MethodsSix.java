public class MethodsSix {
    public static void main(String[] args) {
        // Method to verify user age
        int age = 1;

        if (ageCheck(age)) {
            System.out.println("You may sign up");
        } else {
            System.out.println("You must be 18+ to sign up");
        }

    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
