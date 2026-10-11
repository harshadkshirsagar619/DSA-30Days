package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class IntegerHashing {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the Size of Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the number od Array Size :"+size);
        for (int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int a : arr)
        {
            hashMap.put(a,hashMap.getOrDefault(a,0)+1);
        }

        System.out.println(hashMap);

        System.out.println("Enter the Number to find :");
        int find = sc.nextInt();

        System.out.println("value of "+find+" is :"+hashMap.getOrDefault(find,0));
       /* for (int a : hashMap.keySet())
        {
            System.out.println("Value of "+find+" is :"+hashMap.get(find));
        }

        */
    }
}
