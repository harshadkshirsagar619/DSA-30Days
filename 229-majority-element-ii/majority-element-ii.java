class Solution {
    public List<Integer> majorityElement(int[] arr) {
            int count = 0;
        int element = 0;
        int n = arr.length;

        List<Integer> list = new ArrayList<>();
       
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int a : map.keySet())
        {
            if(map.get(a) > n/3)
            {
                list.add(a);
            }     
        }
        return list;
    
    }
}