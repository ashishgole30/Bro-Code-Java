// printf() Statement = is a method used to format output
// % [flags][width][.precision][specifier-character]
// alternative to print and println
public class printf_specified_character {

    public static void main(String[] args) {

        String name = "Spongebob"; // small s
        char firstletter = 'S'; // small c
        int age = 30; // small d
        double height = 60.5; // small f
        boolean isEmployed = true; // small b

        System.out.printf("Hello %s\n", name);
        System.out.printf("your name starts with a %c\n", firstletter);
        System.out.printf("You are %d years old \n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);
        System.out.printf("%s is %d years old", name, age);

    }
}
