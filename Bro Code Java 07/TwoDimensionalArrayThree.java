public class TwoDimensionalArrayThree {
    public static void main(String[] args) {

        // 2D array = an array where each element is an array

        // CREATING A MINI PROJECT
        // 2D ARRAY THAT RESEMBLED A TELEPHONE NUMBER PAD

        char[][] telephone = { { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' },
                { '*', '0', '#' } };

        for (char[] row : telephone) {
            for (char number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
