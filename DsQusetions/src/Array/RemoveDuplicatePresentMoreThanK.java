package Array;

public class RemoveDuplicatePresentMoreThanK {

    public static void main(String[] args) {
        Integer[] arr = { 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 5 };
        int maxOccurrences = 2;

        makeNullIfMoreThanTwo(arr, maxOccurrences);

        int count = 0;

        // Print the modified array
        for (Integer num : arr) {
            if(num == null)
            {
                count++;
                continue;
            }
            System.out.print(num + " ");
        }
        for(int i = 0; i < count; i++) {
            System.out.print(null + " ");
        }
    }

    public static void makeNullIfMoreThanTwo(Integer[] arr, int maxOccurrences) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int prevNum = arr[0];
        int occurrences = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == prevNum) {
                occurrences++;
                if (occurrences > maxOccurrences) {
                    arr[i] = null; // Replace the element with null
                }
            } else {
                prevNum = arr[i];
                occurrences = 1;
            }
        }
    }
}
