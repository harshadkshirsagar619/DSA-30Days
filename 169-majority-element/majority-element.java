class Solution {
    public int majorityElement(int[] nums) {
         int n = nums.length;
        int currentElement = nums[0];
        int count = 0;

        for(int i = 0;i<n;i++)
        {
            if(count == 0)
            {
                count = 1;
                currentElement = nums[i];
            }else if(nums[i] == currentElement)
            {
                count++;
            }else{
                count--;
            }
        }
        int cnt = 0;
        for(int i = 0;i<n;i++)
        {
            if(nums[i] == currentElement)
            {
                cnt++;
            }
        }
        if(cnt > n/2)
        {
             return currentElement;
        }
        return -1;
    
    }
}