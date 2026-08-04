public class ReverseDigits {
    public static void main(String[] args) {

        int num = 987601;
        int rev = 0;
        while (num != 0)
        {
            int last = num % 10;
            System.out.println(last);
            num = num / 10;
            rev = (rev * 10)+last;
        }
        System.out.println("Rev : "+rev);
    }
}
