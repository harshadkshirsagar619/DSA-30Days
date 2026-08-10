package ArrayManipulation;

import java.util.Arrays;
import java.util.HashSet;

public class UnionArray {

    static int[] union(int[] arr,int[] num)
    {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0;i<= arr.length-1;i++){

            set.add(arr[i]);
        }

        for (int j = 0; j<= num.length-1;j++){
            set.add(num[j]);
        }

        int[] ans = new int[set.size()];
        int k = 0;
        for (int nums : set){
            ans[k++] = nums;
        }

        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,9};
        int[] arr2 = {3,5,6,7,8};

        int[] ans = union(arr,arr2);
        System.out.println(Arrays.toString(ans));
    }
}
