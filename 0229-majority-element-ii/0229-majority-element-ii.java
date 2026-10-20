class Solution {
    public List<Integer> majorityElement(int[] arr) {
            int count1 = 0;
            int count2 = 0;
        int element1 = 0;
        int element2 = 0;
        int n = arr.length;


        for(int i = 0;i<n;i++)
        {
            if(count1 == 0 && arr[i] != element2)
            {
                count1 = 1;
                element1 = arr[i];
            }else if(count2 == 0 && arr[i] != element1)
            {
                count2 = 1;
                element2 = arr[i];
            }else if(arr[i] == element1)
            {
                count1++;
            }else if(arr[i] == element2)
            {
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0 ;
        count2 = 0;

        for(int i = 0;i<n;i++)
        {
            if(element1 == arr[i])
            {
                count1++;
            }
            if(element2 == arr[i])
            {
                count2++;
            }
        }
        List<Integer> list = new ArrayList<>();

        if(count1 > n/3)
        {
            list.add(element1);
        }
        if(count2 > n/3 && element2 != element1)
        {
            list.add(element2);
        }
    return list;
    }
}