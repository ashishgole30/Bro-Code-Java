public class Super {
    public static void main(String[] args) {
        // super = Refers to the parent class
        // (subclass <-- superclass)
        // Used in contructors and method overriding
        // Calls the parent constructor to initialize attributes in the parent class
        // child class is known as subclass
        // parent class is known as superclass

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 3.25);
        Employee employee = new Employee("John", "Tarkowski", 1900);

        person.showName();
        student.showName();
        student.showGPA();
        employee.showSalary();

        // CONCLUSION -
        // "super" refers to the parent class
        // student and employee inherit from person
        // Since the constructor of the parent
        // in this case Person requires a first name and a last name
        // Any children objects that we create ,
        // we have to call the constructor of the parent and pass in those arguments
        // using super(argument one , argument two)
        // If parent didnt require these arguments then you wouldnt need to
    }
}
