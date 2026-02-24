// NOW IF YOU HAVE A CLASS VARIABLE AND LOCAL VARIABLE 
// WITH THE SAME NAME

public class VariableScopeThree {
    static int x = 3; // CLASS SCOPE

    public static void main(String[] args) {

        int x = 1; // LOCAL
        System.out.println(x);

        doSomething();

    }

    static void doSomething() {

        int x = 2; // LOCAL
        System.out.println(x);

    }
}

// OUTPUT-
// 1
// 2

/*
 * EVEN THOUGH THERES A THIRD X VARIABLE
 * JAVA USES LOCAL VARIABLES FIRST
 */
