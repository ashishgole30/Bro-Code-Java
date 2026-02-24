import java.util.Scanner;

public class If_Else_Elseif {
    public static void main(String[] args) {
        // IF STATEMENTS = perform a block of code if its condition is true
        // if (condition){perform this block of code if condition is satisfied}

        // ELSE {perform this block of code if condition is not satisfied}

        // ELSE IF (Also check this condition) {perform this block of code}
        // (note if first if statement condition is satisfied ,
        // all the else if statements below it are skipped)
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student (true/false):");
        isStudent = scanner.nextBoolean();

        // -------GROUP 1 FOR NAME--------------------

        if (name.isEmpty()) // INSTEAD OF ---> if (name == "") we use String method .isEmpty()
        {
            System.out.println("You didnt enter your name");
        } else {
            System.out.println("Hello " + name + "!");
        }

        // ---------GROUP 2 FOR AGE------------------

        if (age >= 65) {
            System.out.println("You are a senior");
        } else if (age >= 18) {
            System.out.println("You are an Adult");
        } else if (age < 0) {
            System.out.println("You haven't been born yet");
        } else if (age == 0)
        // == (double equals) is the comparision operator to check
        // if one value is equal to other value
        // = (single equals) is assignment operator

        {
            System.out.println("You are a baby!");
        } else {
            System.out.println("You are a child");
        }
        // ------------GROUP 3 To check whether a person is student or not---

        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }

        scanner.close();
    }
}