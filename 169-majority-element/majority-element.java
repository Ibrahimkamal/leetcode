class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int length=nums.length;
        for(int i=0;i<nums.length/2+1;i++)
        {
            if(nums[i]==nums[i+length/2])
            {
                return nums[i];
            }
        }
        return 0;
    }
}