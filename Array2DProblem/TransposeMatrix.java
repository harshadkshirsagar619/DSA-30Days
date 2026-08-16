package Array2DProblem;

import java.util.ArrayList;
import java.util.Arrays;

public class TransposeMatrix {

    static int[][] Transpose(int[][] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();

        if (arr == null || arr.length == 0)
        {
            return new int[0][0];
        }

        int totalRow = arr.length;
        int totalCol = arr[0].length;


        int newTotalRow = totalRow;
        int newTotalCol = totalCol;
        int[][] ans = new int[newTotalRow][newTotalCol];


        for (int i = 0;i<totalRow ; i++)
        {
            for (int j = 0;j<totalCol;j++)
            {
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }


    public static void main(String[] args) {


        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans = Transpose(arr);
        System.out.println(Arrays.deepToString(ans));
    }
}
