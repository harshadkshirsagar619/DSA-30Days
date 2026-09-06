class Solution {
    public int singleNumber(int[] nums) {
        
        int onesNumber = 0;
         int n = nums.length;
        for(int i =0;i<n;i++)
        {
            onesNumber = onesNumber ^ nums[i];
        }

        return onesNumber;

    }
}