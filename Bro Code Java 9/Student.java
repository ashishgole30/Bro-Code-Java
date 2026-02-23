public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // setting up a constructor
    // Syntax: accessModifier className(parameters) { }
    // construcor
    Student(String name, int age, double gpa) {
        // since we are receiving arguments we need to set up parameters
        // parameters names may not be always same as attributes names but it is a good
        // practice to keep them same

        // to assign the attributes we can use the "this" keyword
        // this refers to the object we are currently working with
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true; // we can also set default values for attributes that are not receiving
                                // arguments
    }

    void study() {
        System.out.println(this.name + " is studying");
    }
}
