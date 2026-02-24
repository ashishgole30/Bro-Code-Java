public class Ternaryoperator4 {
    public static void main(String[] args) {
        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition ) ? ifTrue : ifFalse;

        int income = 60000;

        int taxRate = (income >= 60000) ? 15 : 7;
        String isRich = (income >= 40000) ? "Rich" : "Poor";
        System.out.println(taxRate);
        System.out.println(isRich);

    }
}
