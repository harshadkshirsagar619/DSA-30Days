package BitwiseOperator.parcticeExample;

public class powerOf2s {
    public static void main(String[] args) {

        int n = 3;

        if ((n&(n-1)) == 0)
        {
            System.out.println("Number power of 2");
        }else {
            System.out.println("Number power nai hai");
        }
    }
}
