public class BreakKeyWord {

    public static void main(String[] args) {
        // break = break put of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;

            }
            System.out.print(i + " ");
        }
    }
}