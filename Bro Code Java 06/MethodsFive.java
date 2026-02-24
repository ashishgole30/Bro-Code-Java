public class MethodsFive {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon()

        String fullname = getFullName("Spongebob", "Squarepants");
        System.out.println(fullname);
    }

    // Method return a full name , afetr we give our first name and last name
    // static keyword needed to call the method from static main method

    static String getFullName(String first, String last) {
        return first + " " + last;

    }
}
