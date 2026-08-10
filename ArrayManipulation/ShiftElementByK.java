package ArrayManipulation;

import java.util.Arrays;

public class ShiftElementByK {

    static int[] shiftByK(int[] arr ,int k)
    {
        int size = arr.length-1;
        int[] num = new int[k];
        for (int i = 0;i < k;i++)
        {
            num[i] = arr[arr.length - k + i];
        }

        for (int i = arr.length-1; i >= k ; i--)
        {
            arr[i] = arr[i-k];
        }

        for (int i = 0;i<k;i++)
        {
            arr[i] = num[i];
        }

        return arr;

    }


    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60};

        int[] arr1 = shiftByK(arr,2);
        System.out.println(Arrays.toString(arr1));
    }
}
