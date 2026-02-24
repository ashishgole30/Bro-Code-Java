
// HYPOTENUSE FORMULA USING JAVA

// c = under-root of "a sqaure" + "b sqaure"
// c = hypotenuse
//  a = first side
//  b = second side

import java.util.Scanner;

public class Hypotenuse {
    // HYPOTENSUE c = Math.sqrt(a² + b²)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("ENTER The Length Of Side A: ");
        a = scanner.nextDouble();

        System.out.print("ENTER The Length Of Side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The Hypotenuse is (side c) is: " + c + "cm");

        scanner.close();

    }
}
