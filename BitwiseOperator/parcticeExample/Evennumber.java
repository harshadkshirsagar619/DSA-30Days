package BitwiseOperator.parcticeExample;

public class Evennumber {
    public static void main(String[] args) {

        int n = 3;

        if ((n & 1) == 0)
        {
            System.out.println("Even");
        }else {
            System.out.println("odd");
        }
    }
}
