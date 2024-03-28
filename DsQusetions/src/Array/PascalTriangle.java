package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {

        System.out.println(generate(5));
    }
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> current, prev = null;

        for(int i = 0; i < numRows; i++) {
            current = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    current.add(1);
                }
                else {
                    current.add(prev.get(j - 1) + prev.get(j));
                }
            }
            prev = current;
            result.add(current);
        }
        return result;
    }

}
