public abstract class Shape {

    // Our shape class will be abstract class
    // use abstract keyword to create abstract class
    // we cannot create any shape objects

    // creating abstract method
    abstract double area();

    // creating concrete method
    void display() {
        System.out.println("This is a shape");
    }

}
