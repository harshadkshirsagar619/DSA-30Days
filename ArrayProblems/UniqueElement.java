package ArrayProblems;

public class UniqueElement {


    static int uniqueElements(int[] arr)
    {
        int element = 0;
        for (int n : arr)
        {
            element = element ^ n;
        }

        return element;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,1};
        int a = uniqueElements(arr);
        System.out.println(a);
    }
}
