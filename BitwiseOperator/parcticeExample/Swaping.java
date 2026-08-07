package BitwiseOperator.parcticeExample;

public class Swaping {
    public static void main(String[] args) {

        int a = 8;
        int b = 9;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a :"+a + " | b :"+b);
    }
}
