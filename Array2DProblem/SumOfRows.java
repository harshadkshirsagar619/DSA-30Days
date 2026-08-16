package Array2DProblem;

import java.util.ArrayList;

public class SumOfRows {


    static ArrayList<Integer> Sum(int[][] arr)
    {
       ArrayList<Integer> list = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0;i<m;i++)
        {
            int sum = 0;
            for (int j = 0;j<n;j++)
            {
                int value = arr[i][j];
                sum = sum + value;
            }
            list.add(sum);
        }

        return list;
    }

    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Sum(arr));
    }
}
