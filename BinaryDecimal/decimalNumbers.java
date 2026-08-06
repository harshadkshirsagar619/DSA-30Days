package BinaryDecimal;

public class decimalNumbers {

    public static void main(String[] args) {

        int n = 6;

        for (int i = 31;i>=0;i--)
        {
            System.out.print((n>>i) & 1);
        }
    }
}
