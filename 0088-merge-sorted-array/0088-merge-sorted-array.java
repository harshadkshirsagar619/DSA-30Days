class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
     /*   int left = 0;
        int right = 0;
        int[] arr = new int[m+n];
        int p = 0;
        while(left < m && right < n)
        {
            if(nums1[left] < nums2[right])
            {
                arr[p] = nums1[left];
                p = p+1;
                left++;
            }else{
                arr[p] = nums2[right];
                p = p +1;
                right++;
            }
        }


        while(left < m)
        {
            arr[p] = nums1[left];
            left++;
            p++;
        }
        while(right < n)
        {
            arr[p] = nums2[right];
            right++;
            p++;
        }

        for(int i = 0;i < m+n ;i++)
        {
                nums1[i] = arr[i];
            
        }
        */

      int left = m-1;
        int right =0;

        while(left >= 0 && right < n)
        {
            if(nums1[left] > nums2[right])
            {
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;

                left--;
                right++;
            }else{
                break;
            }
        }
        for(int i = m;i<m+n;i++)
        {
            nums1[i] = nums2[i-m];
        }

        Arrays.sort(nums1);
       
        
    }
}