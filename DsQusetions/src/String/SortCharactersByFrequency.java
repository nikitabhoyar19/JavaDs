package String;

import java.util.*;

public class SortCharactersByFrequency {

    public static void main(String[] args) {

        System.out.println(frequencySort("treeeddm"));
    }

    public static String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

//        List<Character> chars = new ArrayList<>(map.keySet());
//        chars.sort((a, b) -> map.get(b) - map.get(a));
//        StringBuilder sb = new StringBuilder();
//        for (Character ch : chars) {
//            for(int i = 0; i < map.get(ch); i++) {
//                sb.append(ch);
//            }
//        }

        // Using Priority Queue
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(map.entrySet());

        while(!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            char ch = entry.getKey();
            int count = entry.getValue();
            for(int i = 0; i < count; i++) {
                sb.append(ch);
            }
            // you can use this instead of for :
            // sb.append(String.valueOf(ch).repeat(Math.max(0, count)));
        }
        return sb.toString();
    }
}
