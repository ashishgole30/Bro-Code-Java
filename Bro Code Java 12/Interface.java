public class Interface {
    public static void main(String[] args) {

        // Interface = A blueprint for a class that specifies a set of abstract methods
        // that implenting classes MUST define
        // Supports multiple inheritance -like behavior

        // Usually a class can only have a single parent class
        // but using interfaces, a class can have multiple "parents" and inherit
        // behavior from all of them

        // created two interfaces: Prey & Predator, & three classes:Hawk, fish & rabbit

        // rabbit is a prey, so it implements the Prey interface
        // The prey interface is bascially telling the rabit class
        // "hey, if you want to implement me, you have to define the flee method"

        // hawk is a predator, so it implements the Predator interface
        // The predator interface is basically telling the hawk class
        // "hey, if you want to implement me, you have to define the hunt method"

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        // rabbits dont have a hunt method, and hawks dont have a flee method

        // One key difference between abstract classes and interfaces is that a class
        // can implement multiple interfaces, but it can only extend one abstract class

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

        // Our fish object implenents both the Prey and Predator interfaces, so it has
        // to define both the flee and hunt methods
    }
}
