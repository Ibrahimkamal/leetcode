class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = nums.length+1;
        int start = 0;
        int totalSum = 0;
        for(int end=0;end<nums.length;end++) {
            totalSum += nums[end];
            while (totalSum >= target) {
                result=Math.min(result,end-start+1);
                totalSum -= nums[start];
                start++;
            }
        }
        return (result==nums.length+1)? 0:result;
    }
}