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
    }
}