class Solution {
    public int findPeakElement(int[] nums) {
        int length=nums.length-1;
        if(length==0)
            return 0;
        for(int i=1;i<length;i++){
            if(nums[i]>nums[i-1] &&nums[i]>nums[i+1])
                return i;
        }
        if(nums[1]<nums[0])
            return 0;
        if(nums[length-1]<nums[length])
            return length;
        return -1;
    }
}