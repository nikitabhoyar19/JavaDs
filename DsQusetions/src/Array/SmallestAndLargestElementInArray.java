package Array;

public class SmallestAndLargestElementInArray {

    public static void main(String[] args) {

        int arr[] = { 3, 2, 5, 6, 9, 1, 11, 21, 15 };

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] < smallest) {
                smallest = arr[i];
            }

            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Smallest : " + smallest + " " + "Largest : " + largest);

    }
}
