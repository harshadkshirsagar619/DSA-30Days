package BitwiseOperator.parcticeExample;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a + " | "+b);
    }
}
