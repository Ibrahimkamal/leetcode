class Solution {
    HashMap <Integer,Integer>map;
    private int dp(int []nums,int i){
        if(i==1){
            return Math.max(nums[1],nums[0]);
        }else if(i==0)
            return nums[0];
        if(!map.containsKey(i))
        {
            int max=Math.max(dp(nums,i-1),nums[i]+dp(nums,i-2));
            map.put(i, max);
        }
        return map.get(i);
            
            
    }
    public int rob(int[] nums) {
        map=new HashMap<>();
        return dp(nums,nums.length-1);
    }
}