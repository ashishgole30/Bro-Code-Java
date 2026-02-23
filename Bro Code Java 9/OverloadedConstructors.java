public class OverloadedConstructors {
    public static void main(String[] args) {

        // overloaded constructors = allow a class to have multiple constructors
        // with different parameters lists
        // enable objects to be initialized in different ways

        System.out.println("------------------------------");

        User user1 = new User("BroCode");
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println("------------------------------");

        User user2 = new User("Ashish", "Ashish@gmail.com");
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println("------------------------------");

        User user3 = new User("Varun", "Varun@gmail.com", 21);
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println("------------------------------");

        User user4 = new User();
        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

        System.out.println("------------------------------");

    }
}
