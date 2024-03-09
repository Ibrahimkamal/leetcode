class Solution {
    public int longestSubarray(int[] nums) {
        int ptr1=0,ptr2=0,zeros=0;
        int longest=0;
        while(ptr2<nums.length){
            if(nums[ptr2]==0){
                zeros++;
            }
            while (zeros>1) {
                if(nums[ptr1]==0)
                {
                    zeros--;
                }
                ptr1++;
            }
            longest=Math.max(longest, ptr2-ptr1);
            ptr2++;
        }
        return longest;
    }
}