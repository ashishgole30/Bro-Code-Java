public class StaticOne {
    public static void main(String[] args) {

        // static = static keyword makes a variable or method
        // belong to the class
        // rather than to any specific object
        // commonly used for utiliy methods or shared resouces

        // We can see static keyword also in our main method
        // public STATIC void main

        Friend friendOne = new Friend("John");
        Friend friendTwo = new Friend("Cena");
        Friend friendThree = new Friend("Cena");

        System.out.println(friendOne.numOfFriends);
        System.out.println(friendTwo.numOfFriends);
        System.out.println(friendThree.numOfFriends);

        System.out.println("----------------------");

        // but instead of using name of object
        // we use name of class to access static attributes

        System.out.println(Friend.numOfFriends);
        System.out.println(Friend.numOfFriends);
        System.out.println(Friend.numOfFriends);

        System.out.println("----------------------");

        // calling static method
        Friend.showFriends();

    }
}
