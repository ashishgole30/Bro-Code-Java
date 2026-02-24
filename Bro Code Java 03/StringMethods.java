public class StringMethods {

    public static void main(String[] args) {

        // STRING METHODS
        // ------------------------------------------------------------------------------------------//
        String name = "Bro Code";
        int length = name.length(); // How many characters
                                    // are their in the string
        System.out.println(length);

        char letter = name.charAt(0); // Gives us the character at a specified index
        System.out.println(letter);

        int index = name.indexOf("o"); // Finding a character at a given index
        System.out.println(index);

        int lastIndex = name.lastIndexOf("o"); // Gives the last index of a character
        System.out.println(lastIndex);

        name = name.toUpperCase();
        System.out.println(name); // makes all the letters of the string to UPPERCASE

        name = name.toLowerCase();
        System.out.println(name); // makes all the letters of the string to lowercase
        // --------------------------------------------------------------------------------------------//
        String nametwo = "  bro code  ";

        nametwo = nametwo.trim();
        System.out.println(nametwo); // used to cut the whitespaces

        nametwo = nametwo.replace("o", "a");
        System.out.println(nametwo);// used to replace one character with another character

        // --------------------------------------------------------------------------------------------------------//
        String namethree = "";
        System.out.println(namethree.isEmpty()); // checks of the string is empty or not
        // --------------------------------------------------------------------------------------------

        String namefour = "ashish"; // checks of the string is empty or not
        if (namefour.isEmpty()) {
            System.out.println("Your name is empty");

        } else {
            System.out.println("hello " + namefour);
        }
        // -----------------------------------------------------------------------------
        // to check if our string contains a character
        if (namefour.contains(" ")) {
            System.out.println("Your name contains a space");
        } else {
            System.out.println("your name doesnt contain any spaces");
        }
        // ----------------------------------------------------------------------------------------------------------

        // to check if two strings are equal
        // NOTE- (the equal method doesnt account for case sensitivity)

        String namefive = "is this password?";

        if (namefive.equals("password")) {
            System.out.println("your name cant be password");
        } else {
            System.out.println("hello " + namefive);
        }
        // to ignore case sensitivity we use equalsIgnoreCase

        String namesix = "Password";

        if (namesix.equalsIgnoreCase("password")) {
            System.out.println("your name cant be password");
        } else {
            System.out.println("hello " + namesix);
        }

    }

}
