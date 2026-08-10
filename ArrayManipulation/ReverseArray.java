package ArrayManipulation;

import java.util.Arrays;

public class ReverseArray {


    // TC : O(n)  SC : O(1)
   static int[] reverseArray(int[] arr)
   {
       int start = 0;
       int end = arr.length-1;

       while (start <= end)
       {

           swap(arr,start,end);
         //  int temp = arr[start];
         //  arr[start] = arr[end];
         //  arr[end] = temp;

           start++;
           end--;
       }

       return arr;
   }

   static void swap(int[] arr,int start,int end){
       int temp = arr[start];
       arr[start] = arr[end];
       arr[end] = temp;
   }

    public static void main(String[] args) {

       int[] arr = {2,4,6,8,9,8};

       int[] ans = reverseArray(arr);
        System.out.println(Arrays.toString(ans));


    }
}
