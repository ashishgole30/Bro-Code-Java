public class NestedLoopsOne {
    public static void main(String[] args) {

        // nested loop = A Loop inside another loop
        // used often with matrices or DS&A

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
