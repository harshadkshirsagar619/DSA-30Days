package ArrayProblemP02;

import java.util.*;

public class ThreeSum {

    static List<List<Integer>> threeSum(int[] arr, int target)
    {
        Set<List<Integer>> temps = new HashSet<>();
        int n = arr.length;
        for (int i = 0;i < n-2;i++)
        {
            for (int j = i+1; j < n-1;j++)
            {
                for (int k = j+1; k<n;k++)
                {
                    if (arr[i] + arr[j] + arr[k] == target)
                    {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j] );
                        list.add(arr[k]);
                        temps.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(temps);
    }


    static List<List<Integer>> Sum(int[] arr,int target)
    {

        List<List<Integer>> temp = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0;i<n;i++)
        {
            int start = i + 1;
            int end = n-1;
            while (start < end)
            {
                int sum = arr[i] + arr[start] + arr[end];
                if (target == sum)
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[start]);
                    list.add(arr[end]);
                    temp.add(list);
                    start++;
                    end--;
                } else if (sum > target) {
                    end--;
                } else if (sum < target) {
                    start++;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,7,8,9,2,0};
        System.out.println(threeSum(arr,24));

    }
}
