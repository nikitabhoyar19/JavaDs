package String;

public class ReverseStringRecursively {

    public static void main(String[] args) {

        String string = "anagram";

        System.out.println(reverseRecursively(string));

    }

    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }

}
