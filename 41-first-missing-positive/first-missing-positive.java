class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            if(nums[i]>0){
                set.add(nums[i]);
            }
        }
        if(max<=0){
            return 1;
        }
        for(int i=1;i<=max;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return max+1;
    }
}