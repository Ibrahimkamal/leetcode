class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                left=mid;
                right=mid;
                while(left>0 && nums[left-1]==target)
                    left--;
                while(right<nums.length-1 && nums[right+1]==target)
                    right++;

                return new int[]{left,right};
            }
            if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}