class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer,Boolean> map=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            if(nums[i]>0){
                map.put(nums[i],true);
            }
        }
        if(max<=0){
            return 1;
        }
        for(int i=1;i<=max;i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return max+1;
    }
}