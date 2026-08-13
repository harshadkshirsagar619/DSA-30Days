package ArrayProblemP02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepeatingElement {

    static int repeatingElements(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0;i< arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1 );
        }

        for (int i : arr)
        {
            if (map.get(i) > 1)
            {
                return i;
            }
        }
       /* for (int key : map.keySet()){
            if (map.get(key) > 1)
            {
                return key;
            }
        }

        */
        return -1;
    }

    // All Repeating Number
    static List<Integer> repeat(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0;i< arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1 );
        }

        List<Integer> list = new ArrayList<>();
        for (int n : map.keySet())
        {
            if (map.get(n) > 1){
                list.add(n);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int[] arr = {5,3,2,2,8,7,1,5,3,9,8};
        int a = repeatingElements(arr);
        System.out.println(a);

        System.out.println(repeat(arr));
    }
}
