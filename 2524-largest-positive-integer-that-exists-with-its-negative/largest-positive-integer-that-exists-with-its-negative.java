class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        if(nums[left]>0)
            return -1;
        while(left<right){
            if(Math.abs(nums[left])==nums[right]){
                return nums[right];
            }
            else if(Math.abs(nums[left])>nums[right]){
                left++;
            }
            else if(Math.abs(nums[left])<nums[right]){
                right--;
            }
        }
        return -1;
    }
}