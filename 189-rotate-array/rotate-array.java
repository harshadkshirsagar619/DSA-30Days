class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int[] temp = new int[k];
       
        int m = 0;
        for(int i = n-k;i<n;i++)
        {
             temp[m++] = nums[i] ;
        }
        for(int i = n - k - 1;i>=0;i--)
        {
            nums[i+k] = nums[i];
        }

        //int m = 0;
        for(int j = 0;j<k;j++)
        {
            nums[j] = temp[j];
        }
    }
}