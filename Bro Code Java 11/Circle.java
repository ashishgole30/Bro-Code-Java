public class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // area method needs to be implemented
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    // where as conrete method is inherited from shape class

}
