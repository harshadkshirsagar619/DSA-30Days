class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
         Set<List<Integer>> set = new HashSet<>();

        int n = arr.length;

        for(int i = 0;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                Map<Long,Integer> map = new HashMap<>();
                for(int k = j+1;k<n;k++)
                {
                        long sum =(long) arr[i]+arr[j] + arr[k];
                        
                        long fourth = (long)target - sum;
                        if(map.containsKey(fourth))
                        {
                            List<Integer> list = Arrays.asList(arr[i],arr[j],arr[k],map.get(fourth));
                            Collections.sort(list);
                            set.add(list);
                        }
                        map.put((long)arr[k],arr[k]);
                    
                }
            }
        }
        return new ArrayList<>(set);
     }
}