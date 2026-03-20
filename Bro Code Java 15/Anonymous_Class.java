public class Anonymous_Class {
    public static void main(String[] args) {
        // Anonymous Class = A class that doesnt have a name
        // Cannot be reused
        // Add custom behaviour without having to create a new class
        // Often sued for on time uses (TimerTask , Runnable , callbacks)

        Dog dog1 = new Dog();
        // Anonymous class
        Dog dog2 = new Dog() {
            @Override
            void speak() {
                System.out.println("Scooby Doo says RUH RUh");
            }
        };
        dog1.speak();
        dog2.speak();
    }
}