// printf() Statement = is a method used to format output

// % [flags][width][.precision][specifier-character]

// alternative to print and println

// only one digit displayed after the decimal point if we use 
// precision of .1 

// two digit displayed after the decimal point if we use 
// precision of .2

// three  digit displayed after the decimal point if we use 
// precision of .3 

public class printf_precision {
    public static void main(String[] args) {

        double price1 = 9.5353;
        double price2 = 10.3434;
        double price3 = -54.1234;

        System.out.printf("%.1f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.3f\n", price3);

    }
}
