public class PalindromeNumber {
    public static void main(String[] args) {

        int num = 99858999;
        int rev = 0;
        int newNum = num;
        System.out.println("Num :"+num);
        while (num != 0)
        {
            int last = num % 10;
            num = num / 10;
            rev = (rev * 10)+last;
        }
        System.out.println("Rev : "+rev);
        if (newNum == rev)
        {
            System.out.println("Palindrome Number");
        }else {

            System.out.println("Not Palindrome Number");
        }
    }
}
