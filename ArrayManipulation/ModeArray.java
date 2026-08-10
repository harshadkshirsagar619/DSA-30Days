package ArrayManipulation;

import java.util.HashMap;

public class ModeArray {


    // TC : O(n)  SC : O(n) --> hashmap
    static int modeArrays(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= arr.length - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(map);

        int maxFrequency = -1;
        int MaxFrequencyKey = -1;
        for (int key : map.keySet()) {

            int currentKey = key;
            int currentKeyFrequency = map.get(key);
            if (currentKeyFrequency > maxFrequency) {
                maxFrequency = currentKeyFrequency;
                MaxFrequencyKey = currentKey;
            }

        }
        return MaxFrequencyKey;
    }

    public static void main(String[] args) {

        int[] arr =  {1,4,2,1,3,5,5,2,1,5,2,4,5,3};
        int ans = modeArrays(arr);
        System.out.println(ans);
    }
}
