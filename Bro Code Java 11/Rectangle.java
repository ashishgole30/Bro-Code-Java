public class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // area method needs to be implemented
    @Override
    double area() {
        return length * width;
    }

    // where as conrete method is inherited from shape class
}
