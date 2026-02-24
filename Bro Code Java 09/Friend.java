public class Friend {

    // static modifier
    // Its as if all the object are sharing the same variable
    // but rather than anyone object having the ownership of this variable
    // the Friend class owns it
    // and all objects have access to it
    static int numOfFriends;
    String name;

    Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    // methods can also be modfied by static keyword
    static void showFriends() {
        // if you are working with a static attribite
        // you dont need "this" keyword
        System.out.println("You have " + numOfFriends + " total friends");
    }
}
