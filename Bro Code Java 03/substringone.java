public class substringone {
    public static void main(String[] args) {

        // .substring() = A method that extracts a part of a string
        // beginning index, ending index (ending index not included)
        // .substring(startIndex, endIndex)

        String email = "Bro123@gmail.com";

        String username1 = email.substring(0, 6);
        System.out.println(username1);

        String username2 = email.substring(0, email.indexOf("@"));
        System.out.println(username2);

        String domain1 = email.substring(7, 16);
        System.out.println(domain1);

        String domain2 = email.substring(7);
        System.out.println(domain2);

        String domain3 = email.substring(email.indexOf("@") + 1);
        System.out.println(domain3);

    }
}
