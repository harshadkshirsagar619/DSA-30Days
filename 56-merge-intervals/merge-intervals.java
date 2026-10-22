class Solution {
    public int[][] merge(int[][] arr) {
        
        if(arr.length <= 1)
        {
            return arr;
        }

        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));

        List<int[]> list = new ArrayList<>();
        int[] newArr = arr[0];
        list.add(newArr);

        for(int[] arrr : arr)
        {
            if(arrr[0] <= newArr[1])
            {
                newArr[1] = Math.max(newArr[1],arrr[1]);
            }else{
                newArr = arrr;
                list.add(newArr);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}