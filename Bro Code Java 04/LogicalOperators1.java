public class LogicalOperators1 {
    public static void main(String[] args) {

        // LOGICAL OPERATORS --> Allows us to check or modify more than one condition

        // && = AND (ALL CONDITIONS MUST BE TRUE)
        // || = OR (ONLY ONE CONDITION MUST BE TRUE)
        // ! = NOT (OPPOSITE OF WHAT IS GIVEN)

        double temp = -10;
        boolean isSunny = true;

        if (temp <= 30 && temp >= 0 && isSunny) { // IF THIS IS TRUE AND THIS IS TRUE
                                                  // all the conditions needs to be true

            System.out.println("The weather is GOOD");
            System.out.println("It is Sunny outside");
        }

        else if (temp <= 30 && temp >= 0 && !isSunny) { // NOT logical operator
                                                        // NOt True
            System.out.println("The weather is GOOD");
            System.out.println("It is cloudy outside");
        }

        else if (temp > 30 || temp < 0) { // OR logical operator
                                          // only one condition needs to be true
            System.out.println("The weather is bad");
        }

    }
}
