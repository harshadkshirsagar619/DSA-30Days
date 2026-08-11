package ArrayProblems;

public class MissingNumber {

    static int missingNumber(int[] arr)
    {
        int size = arr.length;

        int sum = 0;
        for (int i = 0;i <= size ; i++)
        {
            sum = sum + i;
        }

        int sum2 = 0;
        for (int i = 0;i< arr.length;i++)
        {
            sum2 = sum2 + arr[i];
        }


        int value = sum - sum2;
        return value;
    }

    public static void main(String[] args) {

        int[] arr = {0,1,2,3,5,4,6,9,8};
        int a = missingNumber(arr);
        System.out.println(a);
    }
}
