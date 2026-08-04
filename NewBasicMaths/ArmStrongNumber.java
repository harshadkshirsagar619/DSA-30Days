public class ArmStrongNumber {
    public static void main(String[] args) {

        int n = 153;
        int temp = n;
        int sum = 0;
        while (n != 0)
        {
            int digit = n % 10;
            int cubeOfDigit = digit * digit * digit;
            sum = sum + cubeOfDigit;
            n = n /10;
        }
        System.out.println(sum);

        if (sum == temp)
        {
            System.out.println("ArmStrong Number");
        }else {
            System.out.println("Not An ArmString");
        }
    }
}
