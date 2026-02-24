import java.util.Scanner;

public class NestedLoopsTwo {
    public static void main(String[] args) {

        // nested loop = A loop inside another loop

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.print("Enter The Number Of Rows:");
        rows = scanner.nextInt();

        System.out.print("Enter The Number Of Columns:");
        columns = scanner.nextInt();

        System.out.print("Enter The Symbol:");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}
