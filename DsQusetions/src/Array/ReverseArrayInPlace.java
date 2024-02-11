package Array;

public class ReverseArrayInPlace {

    public static void main(String[] args) {

        int arr[] = { 5, 9, 10, 11, 21 };
        int result[] = reverse(arr);

        for(int num : result) {
            System.out.print(num + " ");
        }

    }

    public static int[] reverse(int[] arr) {

        int index = arr.length - 1;
        int first = 0;

        for (int i = first; i < index; i++) {

            int temp = arr[index];
            arr[index] = arr[first];
            arr[first] = temp;

            first += 1;
            index -= 1;
        }

        return arr;
    }

}

/*
n = 6
0 1 2 3 4 5
0 5  0 n-i-1 5
1 4  1 n-1-1 4
2 3  2 n-2-1 3
*/
