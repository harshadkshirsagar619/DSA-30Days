package ArrayProblems;

import java.util.Arrays;

public class Sort0s1s {

        public static int[] sort(int[] arr){

            int start = 0;
            int end = arr.length-1;

            while (start < end){

                if (arr[start] == 1 && arr[end] == 0){
                    swap(arr,start,end);
                    start++;
                    end--;
                }
                if (arr[start] == 0){
                    start++;
                }
                if (arr[end] == 1){
                    end--;
                }
            }
            return arr;
        }

       public static void swap(int[] arr,int start,int end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,0,1};
        int[] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
    }
}
