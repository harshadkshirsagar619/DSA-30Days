package ArrayManipulation;

import java.util.Arrays;
import java.util.HashMap;

public class HigestLowestfrequency {

    // TC : O(n)  | SC : O(n)
    static int[] frequency(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int highestFrequency = Integer.MIN_VALUE;
        int highNumber = -1;


        for (int key : map.keySet())
        {
            int currentKey = key;
            int currentKeyValue = map.get(key);

            if (currentKeyValue > highestFrequency){
                highestFrequency = currentKeyValue;
                highNumber = currentKey;
            }
        }

        int lowestFrequency = Integer.MAX_VALUE;
        int lowNumber = -1;

        for (int key : map.keySet()){
            int currentKey = key;
            int currentkeyValue = map.get(key);

            if (currentkeyValue < lowestFrequency){
                lowestFrequency = currentkeyValue;
                lowNumber = currentKey;
            }
        }

        int[] freq = {highNumber,lowNumber};
        return freq;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,2,1,3,4,5,1,2,3,4,3,4,3,9,2};
        int[] ans = frequency(arr);
        System.out.println(Arrays.toString(ans));
    }
}
