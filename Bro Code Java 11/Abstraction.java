public class Abstraction {
    public static void main(String[] args) {

        // Abstract = used to define abstract classes and methods
        // Abstraction is the process of hiding certain details and showing only
        // essential information to the user.
        // Abstract classes CANNOT be instantiated directly
        // can contin 'abstract' method(which must be implemented)
        // can contain 'concrete' method (which are inherited)

        // Real life example : If im teaching someone how to drive, I dont need to
        // explain how the engine works, I just need to explain how to use the car and
        // drive it. The details of how the engine works is hidden from the user, and
        // only the essential information is shown.

        // shape class will be parent
        // circle triangle and rectangle will be child class

        // Our shape class will be abstract class
        // use abstract keyword to create abstract class
        // we cannot create any shape objects

        // circle traingle and rectangle will extend the shape class
        // we can create objects of circle triangle and rectangle class but not of shape
        // class

        // we created an abstract method in shape class called area, which needs to be
        // implemented
        // and we created a concrete method in shape class called display, which is
        // inherited

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        // Inherited
        circle.display();
        triangle.display();
        rectangle.display();

        // implemented
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Area of triangle: " + triangle.area());
        System.out.println("Area of rectangle: " + rectangle.area());

    }
}
