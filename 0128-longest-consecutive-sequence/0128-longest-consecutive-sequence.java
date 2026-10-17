class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums)
        {
            set.add(i);
        }

        int maxlength = 0;
        for(int j : set)
        {
            if(!set.contains(j-1))
            {
                int current = j;
                int count = 1;
                while(set.contains(current+1))
                {
                    count++;
                    current++;
                }
            maxlength = Math.max(maxlength,count);
            }
        }
        return maxlength;
    }
}