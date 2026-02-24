public class printf_width {

    public static void main(String[] args) {

        // WIDHT

        // 0 = zero padding
        // number = right justified padding
        // negavtive number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        int id5 = 4;
        int id6 = 45;

        System.out.printf("%4d\n", id5);
        System.out.printf("%4d\n", id6);

        int id7 = 456;
        int id8 = 4556;

        System.out.printf("%-4d\n", id7);
        System.out.printf("%-4d\n", id8);

    }
}
