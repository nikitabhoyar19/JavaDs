package String;

public class CountVowelAndConstants {

    public static void main(String[] args) {

        String string = "Jai Shri Ram";

        countVowelAndConsonants(string);
    }

    private static void countVowelAndConsonants(String string) {

        int vowelCount = 0;
        int constantCount = 0;

        String vowelStr = new String("aeiouAEIOU");

        for(char ch : string.toCharArray()) {

            int unicode = (int)ch;

            // First make sure given string has only alphabets,
            // if it has chars other than alphabets skip it.

            if((unicode <= 90 && unicode >= 65) || (unicode <= 122 && unicode >= 97)) {

                if(vowelStr.contains(ch+"")) {
                    vowelCount++;
                }
                else {
                    constantCount++;
                }
            }
            else {
                continue;
            }

        }

        System.out.println("Vowels : " + vowelCount);
        System.out.println("Constants : " + constantCount);

    }
}
