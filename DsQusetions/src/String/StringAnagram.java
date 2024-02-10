package String;

import java.util.*;

public class StringAnagram {

    public static void main(String[] args) {
        String str1 = "car";
        String str2 =  "rac";
        boolean result = iAnagram(str1, str2);
        System.out.println(result);
    }

    public static boolean iAnagram(String word, String anagram)
    {
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
        return Arrays.equals(charFromWord, charFromAnagram);
    }

    /*
    1. convert both the strings into charArray
    2. sort both char array
    3. check using Arrays.equal are both strings are equal
    */

}
