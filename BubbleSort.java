package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] buuble(int[] arr,int n)
    {

        for(int i = n-1;i>=0;i--)
        {
            for (int j = 0;j<=i-1;j++)
            {
                if (arr[j] > arr[j+1])
                {
                    swap(arr,j+1,j);
                }
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
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length ;

        int[] num = buuble(arr,n);
        System.out.println(Arrays.toString(num));
    }
}
