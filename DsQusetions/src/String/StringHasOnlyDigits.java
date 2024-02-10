package String;

import java.util.regex.Pattern;

public class StringHasOnlyDigits {

    public static void main(String[] args) {

        String string = "1234a";

        Pattern pattern = Pattern.compile(".*[^0-9].*");

        System.out.println(!pattern.matcher(string).matches());

    }
}
