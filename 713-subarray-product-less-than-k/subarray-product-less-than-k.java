class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int product=1;
        int left=0;
        int right=0;
        int result=0;

        for(left=0,right=0;right<nums.length;right++){
            product*=nums[right];
            while(product>=k && left<=right){
                product/=nums[left];
                left++;
            }
            result+=right-left+1;
        }
        return result;
    }
}