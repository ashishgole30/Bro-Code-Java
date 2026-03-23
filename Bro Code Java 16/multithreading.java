public class multithreading {
    public static void main(String[] args) {

        // Multithreading = Enables a program to run multiple threads concurrently
        // (Thread = A set of instructions that run independently)
        // Useful for background tasks or time consuming operations
        MyRunnableTwo myrunnable = new MyRunnableTwo("PING", "PONG");

        Thread thread1 = new Thread(myrunnable);
        Thread thread2 = new Thread(myrunnable);

        System.out.println("GAME STARTS!");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread was interrupted");
        }
        System.out.println("GAME OVER!");
    }
}