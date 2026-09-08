class Solution {
    public int[] rearrangeArray(int[] nums) {
         
        int n = nums.length;
        int[] positive = new int[n/2];
        int[] negative = new int[n/2];
        int k = 0;
        int j = 0;
        for(int i = 0;i<n;i++)
        {
            if(nums[i] >= 0)
            {
                positive[k++] = nums[i];
            }else{
                negative[j++] = nums[i];
            }
        }

        for(int i = 0;i<n/2;i++)
        {
            nums[2 * i] = positive[i];
            nums[2*i+1] = negative[i];
        }

        return nums;
   
    }
}