public class printf_flags {

    public static void main(String[] args) {

        // FLAGS
        /*
         * + = output a plus
         * , = comma grouping separator
         * ( = negative numbers are enclosed in ()
         * space = display a minus if negative , space if postive
         */

        double price1 = 9000.99;
        double price2 = 100000.15;
        double price3 = -54000.01;
        double price4 = 12.989;
        double price5 = -12.989;

        System.out.printf("%+.2f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%(.2f\n", price3);
        System.out.printf("% .2f\n", price4);
        System.out.printf("% .2f\n", price5);
    }
}
