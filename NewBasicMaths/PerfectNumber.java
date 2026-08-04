public class PerfectNumber {
    public static void main(String[] args) {

        int num = 6;
        int temp1 = num;
        int sum = 1;
        for (int i = 2 ; i*i <= num ; i++)
        {
            if (num % i == 0)
            {
                int firstFactor = i;
                int secondfactor = num/i;
                sum = sum + firstFactor + secondfactor;
            }
            System.out.println(sum);
        }
        System.out.println(sum);
        if (sum == temp1)
        {
            System.out.println("Number is perfect Number");
        }else {
            System.out.println("number is not Perfect number");
        }
    }
}
