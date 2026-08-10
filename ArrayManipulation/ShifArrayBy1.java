package ArrayManipulation;

import java.util.Arrays;

public class ShifArrayBy1 {

    // TC : O(n)  SC : O(1)
    static int[] shiftArray(int[] arr){

        int size = arr.length-1;
        int temp = arr[size];
        for (int i = size; i > 0; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60};

        int[] ans = shiftArray(arr);
        System.out.println(Arrays.toString(ans));
    }
}
