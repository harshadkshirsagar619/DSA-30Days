class Solution {
    int rev = 0;
    public int reverse(int x) {
        
        while(x != 0)
        {
            int lastDig = x % 10;
            x = x / 10;

            if(rev > Integer.MAX_VALUE / 10 ||
                rev == Integer.MAX_VALUE / 10 && lastDig > 7)
                {
                    return 0;
                }

             
            if(rev < Integer.MIN_VALUE / 10 ||
                rev == Integer.MIN_VALUE / 10 && lastDig < -8)
                {
                    return 0;
                } 

                rev = (rev * 10) + lastDig;  
        }
        return rev;
    }
}