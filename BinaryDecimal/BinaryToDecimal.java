package BinaryDecimal;

public class BinaryToDecimal {
    public static void main(String[] args) {

        int n = 110;
        int count = 0;
        int ans = 0;
        while (n != 0)
        {
            int digit = n % 10;
            if (digit == 1)
            {
                ans = ans + (int)Math.pow(2,count);
            }
            count++;
            n=n/10;
        }
        System.out.println(ans);
    }
}
