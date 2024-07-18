class Solution {
    public int maxSubArray(int[] nums) {
        int currentSubArray=nums[0];
        int maxSubArray=nums[0];
        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            currentSubArray=Math.max(currentSubArray+num,num);
            maxSubArray=Math.max(currentSubArray, maxSubArray);
        }
        return maxSubArray;
    }
}