package BitwiseOperator.parcticeExample;

public class Powerof4 {
    public static void main(String[] args) {

        int n= 4;

        if (n>0 && (n & (n-1))==0){
            System.out.println("power of 4");
        }else {
            System.out.println("Power nai");
        }
    }
}
