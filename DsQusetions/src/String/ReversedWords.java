package String;

import java.util.*;

public class ReversedWords {

    public static void main(String[] args) {

        String string = "Geek for Geeks";
        System.out.println(reverseWords(string));

    }

    public static String reverseWords(String string) {

        List< String> words = Arrays.asList(string.split("\\s"));
        // Collections.reverse(words);
        StringBuilder sb = new StringBuilder(string.length());
        for (int i = words.size() - 1; i >= 0; i--)
        {
            sb.append(words.get(i));
            sb.append(' ');
        }
        return sb.toString();

    }

}
