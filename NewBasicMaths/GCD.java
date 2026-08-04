public class GCD {
    public static void main(String[] args) {

        int a=18;
        int b=12;

        while (b != 0)
        {
            int temp = b;
            b = a% b;
            a = temp;
        }
        int ans = a;
        System.out.println(ans);

        int c = GetLCM(18,12);
        System.out.println("LCM : "+c);
    }

    // LCM Number
    public static int GetLCM(int a,int b)
    {
        int temp2 = b;
        int temp1 = a;
        while (b != 0)
        {
            int temp = b;
            b = a% b;
            a = temp;
        }
        int ans = a;
        System.out.println("GCD :"+ans);
        int product = temp1 * temp2;
        int lcm = product / ans;
        return lcm;
    }

}
