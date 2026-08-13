package ArrayProblemP02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    static int removeDuplicates(int[] arr)
    {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int a:arr)
        {
            set.add(a);
        }
        System.out.println(set);
        return set.size();

    }


    static int remove(int[] arr)
    {
        int n = arr.length;
        int i = 0;
        int j = i+1;

        if (n==0)
        {
            return 0;
        }
        while (j<n)
        {
            if (arr[i] == arr[j])
            {
                j++;
            } else if (arr[i]!=arr[j]) {
                arr[i+1] = arr[j];

                i++;
                j++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {

        int[] arr = {0,0,1,1,1,2,2,2,3,3,4,4,5,6};

        System.out.println(remove(arr));
    }
}
