package String;

import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        String str = "nikita";

        char strChar[] = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        for(Character charI : strChar) {
            if(charMap.containsKey(charI)) {
                charMap.put(charI, charMap.get(charI) + 1);
            }
            else {
                charMap.put(charI, 1);
            }
        }

        for (Map.Entry<Character, Integer> en :
        charMap.entrySet()) {

            if (en.getValue() > 1) {
                System.out.println(en.getKey()
                        + " : "
                        + en.getValue());
            }
        }

//        System.out.println(charMap.get('i'));
//        System.out.println(charMap.get('n'));
//
//        System.out.println(Arrays.asList(charMap));

    }
}
