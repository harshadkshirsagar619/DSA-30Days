public class CountNumbers {
    public static void main(String[] args) {

        int num = 987601;
        int count = 0;
        while (num != 0)
        {
            int  last = num % 10;
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }
}
