package Sorting;

import java.util.Arrays;

public class InsertionSort {


    public static int[] insertion(int[] arr,int n)
    {

        for(int i = 0;i<=n-1;i++)
        {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j])
            {
                swap(arr,j-1,j);
                j--;
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

        int[] num = insertion(arr,n);
        System.out.println(Arrays.toString(num));

    }
}
