public class Triangle extends Shape {

    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // area method needs to be implemented
    @Override
    double area() {
        return 0.5 * base * height;
    }
    // where as conrete method is inherited from shape class

}
