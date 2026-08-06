package BinaryDecimal;

public class DecimalToBinary {
    public static void main(String[] args) {

        /*
        int n = 7;
        int ans = 0;
        int i = 0;
        while (n != 0)
        {
            int bit = n & 1;
            ans = (bit * (int)Math.pow(10,i) + ans);
            n = n >> 1;
            i++;
        }

        System.out.println(ans);

         */

        int n = 21;
        int ans = 0;
        int place = 1;
        while (n!=0)
        {
            int rem = n % 2;

            ans = ans + rem  * place;
            place = place * 10;
            n = n/2;
        }

        System.out.println(ans);
    }
}
