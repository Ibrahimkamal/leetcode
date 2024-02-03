class Solution {
    private int nums[];
    private Map<Integer,Integer> memo=new HashMap<>();
    
    private int dp(int i)
    {
        if (i==0){
            return this.nums[0];
        }else if (i==1){
            return Math.max(this.nums[0],this.nums[i]);
        }
        if (!this.memo.containsKey(i))
        {
            this.memo.put(i,Math.max(dp(i-1),dp(i-2)+this.nums[i]));
        }
        return this.memo.get(i);
    }
    public int rob(int[] nums) {
        this.nums=nums;
        return dp(nums.length-1);
    }
}