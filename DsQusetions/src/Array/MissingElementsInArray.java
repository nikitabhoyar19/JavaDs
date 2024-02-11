package Array;

public class MissingElementsInArray {

    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };

        int[] register = new int[arr.length];
         for (int i : arr)
         {
             register[i] = 1;
         }
         System.out.println("missing numbers in given array");

         for (int i = 1; i < register.length; i++)
         {
             if (register[i] == 0)
             {
                 System.out.println(i);
             }
         }
    }
}
