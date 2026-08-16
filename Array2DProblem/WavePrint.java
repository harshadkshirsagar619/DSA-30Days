package Array2DProblem;

import java.util.ArrayList;

public class WavePrint {

    static ArrayList<Integer> wave(int[][] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;

        for (int col = 0;col < n;col++)
        {

            if ((col & 1) == 1)
            {
                for (int row = m-1;row >= 0;row--)
                {
                    list.add(arr[row][col]);
                }
            }else {
                for (int row = 0;row<m;row++)
                {
                    list.add(arr[row][col]);
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {


        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(wave(arr));
    }
}
