package ArrayProblems;

import java.util.Arrays;

public class Sort0s1s2s {

    static int[] sort(int[] arr)
    {
        int start = 0;
        int mid = 0;
        int end = arr.length-1;

        while (mid < end)
        {
            if (arr[mid] == 0)
            {
                swap(arr,start,mid);
                start++;
                mid++;
            } else if (arr[mid] == 1)
            {
                mid++;
            } else if (arr[mid] == 2)
            {
                swap(arr,mid,end);
                end--;
            }
        }
        return arr;
    }

    static void swap(int[] arr , int start , int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {2,0,1,2,1,0,1,2,0,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
