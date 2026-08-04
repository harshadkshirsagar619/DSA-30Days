public class primeNumber {
    public static void main(String[] args) {
/*
        int n = 10;

        if (n <= 1)
        {
            System.out.println("Number is not prime");
        }else {
            for (int i =2;i<= n-1;i++)
            {
                if (n%i==0)
                {
                    System.out.println("Number is Not prime");
                    return;
                }
            }
            System.out.println("number is prime");
        }

 */

        int num = 11;
        for (int i =2;i*i <= num ;i++)
        {
            if (num % i ==0)
            {
                System.out.println("Number is not prime");
                return;
            }
        }
        System.out.println("number is prime");
    }
}
