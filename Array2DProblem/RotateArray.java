package Array2DProblem;

import java.util.Arrays;

public class RotateArray {

    static void rotate(int[] arr,int d)
    {

        int n = arr.length;
         d = d % n;
        int[] ans = new int[d];

        for(int i = 0;i<d;i++)
        {
            ans[i] = arr[i];
        }

        for(int i = 0;i<n-d;i++)
        {
            arr[i] = arr[i + d];
        }


        for(int i = 0;i<d;i++)
        {
            arr[n-d + i] = ans[i];
        }

        System.out.println(Arrays.toString(arr));


    }
    public static void main(String[] args) {

        int[] arr = {7,3,9,1};

        rotate(arr,9);
    }
}
