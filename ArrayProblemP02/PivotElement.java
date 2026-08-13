package ArrayProblemP02;

import java.util.Arrays;

public class PivotElement {

    static int pivotElement(int[] arr)
    {
        int n = arr.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        leftSum[0] = arr[0];

        for (int i = 1;i<n;i++){
            leftSum[i] = leftSum[i-1] + arr[i];
        }

        rightSum[n-1] = arr[n-1];
        for (int i = n-2 ; i >= 0;i--)
        {
            rightSum[i]  = rightSum[i+1] + arr[i];
        }

        for (int i = 0;i<n;i++)
        {
            if (rightSum[i] == leftSum[i])
            {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,9,1,9,6,8,4,10};
        System.out.println(pivotElement(arr));
    }
}
