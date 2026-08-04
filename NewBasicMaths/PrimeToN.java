public class PrimeToN {
    public static void main(String[] args) {

        int num = 50;
        for (int i = 1;i<num;i++)
        {
            if (prime(i) == true)
            {
                System.out.println("prime Number :"+i);
            }
        }
    }

    public static boolean prime(int a)
    {
        for (int i=2;i*i<=a;i++)
        {
            if (a % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
