class Solution {
    public void moveZeroes(int[] nums) {
          int n = nums.length;
        int[] temp = new int[n];
        int m = 0;
        for(int i = 0;i<n;i++)
        {
            if(nums[i] != 0)
            {
                temp[m++] = nums[i];
            }
        }

        for(int i = 0;i<n;i++)
        {
            nums[i] = temp[i];
        }
        int x = temp.length;
        for(int i = x+1;i<n;i++)
        {
            nums[i] = 0;
        }
  
    }
}