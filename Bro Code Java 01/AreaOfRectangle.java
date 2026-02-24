import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double height;
        double width;
        double area;

        System.out.print("Enter Height Of A Rectangle(cms):");
        height = scanner.nextDouble();
        System.out.print("Enter Width Of A Rectangle(cms):");
        width = scanner.nextDouble();

        area = height * width;

        System.out.println("The Area Of Rectangle is " + area + " cms squared");

        scanner.close();

    }
}
