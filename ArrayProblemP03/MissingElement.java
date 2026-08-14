package ArrayProblemP03;

import java.util.ArrayList;

public class MissingElement {


    static ArrayList<Integer> missingElement(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        for (int i = 0;i<n;i++)
        {
            int value = Math.abs(arr[i]);
            int position = value - 1;

            if (arr[position] > 0)
            {
                arr[position] = -arr[position];
            }
        }


        for (int i = 0;i<n;i++)
        {
            if (arr[i] > 0)
            {
                int value = i+1;
                list.add(value);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        int[] arr = {4,4,5,2,2};
        System.out.println(missingElement(arr));

    }
}
