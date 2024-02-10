package String;

import java.util.*;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String str = "nikita";
        char[] charArray = str.toCharArray();

        HashMap<Character, Integer> charMap = new LinkedHashMap<>();

        for(char c : charArray) {
            if(charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            }
            else {
                charMap.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if(entry.getValue() == 1)
                System.out.println(entry.getKey());
                break;
        }
    }
}
