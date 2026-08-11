package ArrayProblems;

public class MissingNumber02 {

    static int missingNumber(int[] arr)
    {
        int size = arr.length;

        int XORSum = 0;

        for (int n : arr)
        {
            XORSum = XORSum ^ n;
        }

        for (int i = 0;i<=size; i++)
        {
            XORSum = XORSum ^ i;
        }

        return XORSum;
    }

    public static void main(String[] args) {

        int[] arr = {0,1,2,3,5,4,6,9,8};
        int a = missingNumber(arr);
        System.out.println(a);
    }
}
