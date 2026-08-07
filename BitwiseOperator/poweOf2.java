package BitwiseOperator;

public class poweOf2 {
    public static void main(String[] args) {

    /*    int n = 7;

        int count = 0;

        while (n != 0)
        {
            if ((n&1) != 0){
                count++;
            }
            n=n>>1;
        }
        System.out.println("Set bit Count :"+count);

     */

        int n = 16;
        if ((n & (n-1)) == 0)
        {
            System.out.println("power of 2 hai");
        }else {
            System.out.println("power of 2 nai hai");
        }
    }
}
