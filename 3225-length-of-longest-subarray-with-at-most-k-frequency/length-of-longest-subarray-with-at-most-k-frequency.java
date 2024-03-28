class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int left,right;
        int result=0;
        for(left=0,right=0;right<nums.length;right++){
            int val=nums[right];
            map.put(val,map.getOrDefault(val, 0)+1);
            while(map.get(val)>k){
                int left_val=nums[left];
                map.put(left_val,map.getOrDefault(left_val, 0)-1);
                left++;
            }
            result=Math.max(result,right-left+1);
        }
        return result;
    }
}