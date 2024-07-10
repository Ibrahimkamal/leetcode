class Solution {
    public int removeDuplicates(int[] nums) {
        int insert_ptr=1;
        int frequency=1;
        for (int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                frequency++;
            }else{
                frequency=1;
            }
            if (frequency<=2){
                nums[insert_ptr++]=nums[i];
                // insert_ptr++;
            }
        }
        return insert_ptr;
    }
}