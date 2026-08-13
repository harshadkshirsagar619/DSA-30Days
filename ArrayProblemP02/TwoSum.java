package ArrayProblemP02;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    // TC : O(n^2)  |  SC : O(1)
   static int[] Sum(int[] arr,int target) {

       int n = arr.length;

       for (int i = 0; i < n; i++) {
           for (int j = i + 1; j < n; j++) {
               if (arr[i] + arr[j] == target) {
                   int[] ans = {i, j};

                   return ans;
               }
           }
       }
       int ans[] = {};
       return ans;
   }

   // Approch 2
   // TC : O(n) and SC : O(1)
   static int[] Sum2(int[] arr,int target)
   {
       HashMap<Integer,Integer> map = new HashMap<>();

       for (int i = 0;i<arr.length;i++)
       {
           int comp = target - arr[i];
           if (map.containsKey(comp)){
               return new int[] {map.get(comp),i};

           }
           map.put(arr[i] ,i);
       }
       return new int[]{};
   }


    public static void main(String[] args) {
        int[] arr = {1,7,3,2,6,8,3,5};
        int[] ans = Sum2(arr,12);
        System.out.println(Arrays.toString(ans));
    }
}
