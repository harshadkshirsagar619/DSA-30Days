package Sorting;

import java.util.Arrays;

public class SectionSort {

    public static int[] selectionSort(int[] arr,int n)
    {

        for(int i = 0;i<=n-2;i++)
        {
            int min = i;
            for (int j = i;j<=n-1;j++)
            {
                if (arr[j] < arr[min])
                {
                    min = j;
                }
                swap(arr,i,min);
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
       int[] num =  selectionSort(arr,n);
        System.out.println(Arrays.toString(num));
    }
}
