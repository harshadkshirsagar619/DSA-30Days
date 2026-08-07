package BitwiseOperator.parcticeExample;

public class UniqueElement {
    public static void main(String[] args) {

        int[] arr = {2,3,5,3,2};

        int ans = 0;

        for (int i = 0;i< arr.length;i++)
        {
            ans = ans ^ arr[i];
        }
        System.out.println("unique element :"+ans);
    }
}
