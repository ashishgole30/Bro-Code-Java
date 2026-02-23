public class Inheritance {
    public static void main(String[] args) {

        // Inheritance = Once class inherits the attributes
        // and methods from another class
        // Child <-- Parent

        // Organism Class grandparent
        // Animal Class will be the parent
        // Dog and Cat Class

        // use "extends" keyword
        // public class (child class name) extends (parent class name)

        // each child class can have its own unique attributea
        // and methods too

        // Multilevel Inheritance
        // Child <-- Parent <-- Grandparent
        /*
         * Organims
         * |***** |
         * Plant Animal
         * ****** |******|
         * ****** dog*****cat
         */

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println("------------");
        System.out.println("Is Dog Alive? (true/false)? " + dog.isAlive);
        System.out.println("Is Cat Alive? (true/false)? " + cat.isAlive);
        System.out.println("Is Plant Alive? (true/false)? " + plant.isAlive);
        System.out.println("------------");
        dog.eat();
        cat.eat();
        System.out.println("------------");
        System.out.println("The dog has " + dog.lives + " lifes");
        System.out.println("The dog has " + cat.lives + " lifes");
        System.out.println("------------");
        dog.speak();
        cat.speak();
        System.out.println("------------");
        plant.photosynthesize();

        // dogs and cat cannot photosynthesize

    }
}
