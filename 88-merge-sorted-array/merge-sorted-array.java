class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr=nums1.length-1;
        m--;
        n--;
        while(m>=0 ||n>=0)
        {
            if (m<0)
            {
                nums1[ptr]=nums2[n];
                n--;
            }
            else if(n<0)
            {
                nums1[ptr]=nums1[m];
                m--;
            }
            else if(nums1[m]>nums2[n])
            {
                nums1[ptr]=nums1[m];
                m--;
            }else{
                nums1[ptr]=nums2[n];
                n--;
            }
            ptr--;
        }
    }
}