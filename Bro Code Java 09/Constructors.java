// Now in previous example we saw that we can create objects without constructors 
// but the objects will have same methods and attributes as the class 
// but if we want to create objects with different attributes and methods then we can use constructors
public class Constructors {
    public static void main(String[] args) {
        // constructor = a special method to initialize objects
        // you can pass arguments to a constructor
        // and set up initial values

        // passing arguments to a constructor
        Student student1 = new Student("Bro", 20, 3.5);
        Student student2 = new Student("Spongebob", 25, 4.0);

        System.out.println(student1.name + " " + student1.age + " " + student1.gpa + " " + student1.isEnrolled);
        System.out.println(student2.name + " " + student2.age + " " + student2.gpa + " " + student2.isEnrolled);

        Student student3 = new Student("Patrick", 30, 2.5);
        System.out.println(student3.name + " " + student3.age + " " + student3.gpa + " " + student3.isEnrolled);

        student1.study();
        student2.study();
        student3.study();
    }
}
