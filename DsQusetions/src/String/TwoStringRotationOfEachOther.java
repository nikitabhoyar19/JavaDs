package String;

public class TwoStringRotationOfEachOther {

    public static void main(String[] args) {

//        String str1 = "IndiaVsSouth";
//        String str2 = "SouthVsIndia";

        String str1 = "IndiaVsSouth";
        String str2 = "SouthIndiaVs";

        if(isStringsAreRotated(str1, str2)) {
            System.out.println("They are rotation of Each other");
        }
        else {
            System.out.println("They are not rotation of each other");
        }

    }

    public static boolean isStringsAreRotated(String original, String temp) {

        if(original.length() != temp.length()) return false;

        String concatenated = original + original;
        System.out.println(concatenated);

        if(concatenated.indexOf(temp) != -1) {
            return true;
        }

        return false;

    }

}
