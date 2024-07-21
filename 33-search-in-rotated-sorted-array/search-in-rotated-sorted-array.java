class Solution {
    public int search(int[] nums, int target) {
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                k=i;
                break;
            }
        }
        int length=nums.length;
        int left=k;
        int right=(k+length-1);
        int mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[(mid)%length]==target){
                return mid%length;
            }
            if(nums[(mid)%length]<target){
                left=(mid)+1;
            }else{
                right=(mid)-1;
            }
        }
        return -1;
    }
}