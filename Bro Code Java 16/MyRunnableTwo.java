public class MyRunnableTwo implements Runnable {

    private final String text1;
    private final String text2;

    MyRunnableTwo(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(text1);
                System.out.println(text2);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }
}