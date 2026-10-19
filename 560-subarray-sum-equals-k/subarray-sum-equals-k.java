class Solution {
    public int subarraySum(int[] arr, int k) {
      
       
        Map<Integer,Integer> map = new HashMap<>();

        int n = arr.length;
        map.put(0,1);
        int preSum = 0;
        int count = 0;

        for(int i = 0;i<n;i++)
        {
            preSum += arr[i];
            int remove = preSum - k;

            if(map.containsKey(remove))
            {
                count= count + map.get(remove);
            }

            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}