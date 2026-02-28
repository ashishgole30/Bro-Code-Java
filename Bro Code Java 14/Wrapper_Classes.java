public class Wrapper_Classes {
    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values
        // (int , char , double , boolean)
        // to be used as objects.
        // "Wrap them in an object"
        // Generally , dont wrap primitives unless you need an object
        // Allows use of Collections Framework and static Utility Methods

        // Instead of
        // int a = 123;

        // Older Way
        // Integer a = new Integer(123);
        // Double b = new Double(3.14);
        // Character c = new Character('$');
        // Boolean d = new Boolean(true);

        // a b c d are all objects

        // Modern way called as Autoboxing
        // These all are reference data types
        // they are a type of object
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
        String e = "Pizza";

        // Unboxing
        int v = a;
        double w = b;
        char x = c;
        boolean y = d;
        String z = e;

        // Converting Primitive Data Type into String
        // toString() Method of this Wrapper classes
        String one = Integer.toString(123);
        String two = Double.toString(3.14);
        String three = Character.toString('@');
        String four = Boolean.toString(false);

        String five = one + two + three + four;
        // All One Long String
        System.out.println(five);

        // Converting String into Primitive Data Type
        // Another useful utility method of wrapper class
        // Parsing

        int intnum = Integer.parseInt("123");
        double doublenum = Double.parseDouble("3.14");
        // characters do not have a parse method
        char charc = "Pizza".charAt(0);
        boolean boold = Boolean.parseBoolean("true");

        // String result = intnum + doublenum + charc + boold;
        // This doesnt work because we are mixing and matching
        // different data types

        char letterone = 'b';
        char lettertwo = '$';
        // we can check if our letter is actually a letter
        // accessing Character Wrapper Class and call .isLetter Method
        // Outputs a boolean : true/false
        System.out.println(Character.isLetter(letterone));
        System.out.println(Character.isLetter(lettertwo));

        char letterthree = 'b';
        char letterfour = 'B';
        // we can check if our letter is Uppercase or not
        // accessing Character Wrapper Class and call .isUpperCase Method
        // Outputs a boolean : true/false
        System.out.println(Character.isLetter(letterthree));
        System.out.println(Character.isLetter(letterfour));

    }
}