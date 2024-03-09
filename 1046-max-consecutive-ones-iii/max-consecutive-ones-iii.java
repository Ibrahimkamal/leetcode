class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros=0,ptr1=0,ptr2=0;
        int longest=0;
        while(ptr2<nums.length)
        {  
            if(nums[ptr2]==0)
            {
                zeros++;
            }
            while (zeros>k)
            {
                if(nums[ptr1]==0)
                {
                    zeros--;
                }
                ptr1++;
            }
           longest=Math.max(longest,ptr2-ptr1+1);
           ptr2++;
        }

        return longest;
    }
}