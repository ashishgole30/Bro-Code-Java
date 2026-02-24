import java.util.Scanner;

public class CircumferenceAreaVolume {
    public static void main(String[] args) {
        // ---------FOR SPHERE-------------------
        // circumferene = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius , 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumferene;
        double area;
        double volume;

        System.out.print("ENTER THE RADIUS: ");
        radius = scanner.nextDouble();

        circumferene = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        /*
         * PRINT F STATEMENT
         * we can only display the few digits of the output
         * using printf statement
         * INSTEAD OF print(); OR println():
         * WE USE printf();
         */

        System.out.printf("The Circumference is:  %.1fcm\n", circumferene);
        System.out.printf("The area is:  %.1fcm²\n", area);
        System.out.printf("The volume is:  %.1fcm³\n", volume);

        scanner.close();

    }

}
