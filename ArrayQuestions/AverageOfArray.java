package ArrayQuestions;

import java.util.Arrays;

public class AverageOfArray {

    // Q) 1 : Find Average of an Array
    // TC = O(n) SP = O(1)
    static double getAverage(int[] arr){
        double sum = 0;
        for (int a : arr) {
            sum = sum + a;
        }
        int total = arr.length;
        double avg = sum / total;
        return avg;
    }

    // Q)2 : multiply Each Element of Array By 10
    // TC : O(n)  SC : O(n)
    static int[] Multiply(int[] arr){

        int size = arr.length;
        int[] newArray = new int[size];
        for (int i = 0;i <= arr.length-1;i++)
        {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
            //newArray[i] = arr[i]*10;
        }
        return newArray;
    }

    //Q) 3. Search For An Element in an Array(Linear Search)
    // TC : O(n)  SC : O(1)
    static boolean findTarget(int[] arr,int target)
    {

        for (int i = 0;i<=arr.length-1;i++)
        {
            if (target == arr[i]){
                return true;
            }
        }
        return false;
    }


    // Q) 4. Find Maximum Element in an Array
    // TC : O(n)  SC : O(1)

    static int findMaximumElement(int[] arr)
    {
        int max = arr[0];
        for (int i = 1;i<= arr.length-1;i++)
        {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }


    // Find Sum of Positive ANd Negative
    // TC : O(n) SC : O(1)

    static int[] getPosNegSum(int[] arr)
    {
        int posSum = 0;
        int NegSum = 0;

        for (int i = 0;i<=arr.length-1;i++)
        {
            if(arr[i] > 0){
                posSum += arr[i];
            }else {
                NegSum += arr[i];
            }
        }
        int[] Sum = {posSum,NegSum};
        return Sum;
    }


    //Count the number of Zeroes and Ones
    // TC : O(n) SC : O(1)
    static int[] Count(int[] arr)
    {
        int countZero = 0;
        int countOne = 0;
        for (int i = 0;i< arr.length;i++)
        {
            if (arr[i] == 1){
                countOne++;
            }else {
                countZero++;
            }
        }
        int[] count = {countZero,countOne};
        return count;
    }


    // find an Unsorted first Element
    // TC : O(n) SC : O(1)
    static int unsortedElement(int[] arr)
    {
        int element = arr[0];
        for (int i = 1;i< arr.length;i++)
        {
            if (arr[i] > element)
            {
                element = arr[i];
            }else {
                return arr[i];
            }
        }
        return 0;
    }

    // Swap Alternate element in an array
    static int[] swapAlternate(int[] arr){
        int size = arr.length;

       // int[] ans = new int[size];
        for (int i =0;i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;

         //   ans[i] = arr[i];
         //   ans[i+1] = arr[i+1];
        }
        return arr;
    }


    // print intersection element of array
    // TC : O(n^2) SC : O(n)
    static int[] intersectionArray(int[] arr,int[] arr2){

        int size = arr.length;
        int[] intern = new int[size];
        int k = 0;
        for (int i = 0;i<arr.length;i++)
        {
            for (int j = 0; j < arr2.length;j++){
                if (arr[i] == arr2[j]){
                    intern[k] = arr2[j];
                    k++;
                    break;
                }
            }
        }
        return intern;
    }



    // print Alternate Extreme Element of array
    static int[] extremeAlternate(int[] arr){

        int k = 0;
        int start = 0;
        int end = arr.length-1;
        int size = arr.length;

        int[] ans = new int[size];

        while (start <= end){

            ans[k++] = arr[start];
            ans[k++] = arr[end];

            start++;
            end--;
        }
        if (start == end){
            arr[k] = arr[start];
        }
        return ans;

    }


    public static void main(String[] args) {

        int[] arr = {1,2,4,9,5,9};

        int[] ans = extremeAlternate(arr);
        System.out.println(Arrays.toString(ans));

        //int[] arr2 = {2,5,6,7,8};
        //int[] ans = intersectionArray(arr,arr2);
        //System.out.println(Arrays.toString(ans));


     //   int[] ans = swapAlternate(arr);
     //   System.out.println(Arrays.toString(ans));
     //   System.out.println();

        //System.out.println(unsortedElement(arr));

      /*  int[] arr1 = {0,1,1,1,0,1,0,0,1};
        int[] ans = Count(arr1);
        System.out.println(Arrays.toString(ans));


       */

       // int[] ans = getPosNegSum(arr);
        //System.out.println(Arrays.toString(ans));

        //System.out.println(findMaximumElement(arr));

        //System.out.println(findTarget(arr,2));

        /*
        int ans[] = Multiply(arr);
        System.out.println(Arrays.toString(ans));
        for (int i :ans){
            System.out.println(i);
        }

         */



       // System.out.println(getAverage(arr));

    }
}
