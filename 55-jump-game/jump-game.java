class Solution {
    int[] nums;
    Boolean[]cache;
    private boolean dp(int index){
        if(index==nums.length-1)
            return true;
        else if(index>nums.length-1)
            return false;
        if(this.cache[index]!=null)
            return this.cache[index];
        for(int i=1;i<=nums[index];i++){
            if(dp(index+i))
                return true;
            else
                this.cache[index]=false;
        }
        return false;
    }
    public boolean canJump(int[] nums) {
        this.nums=nums;
        cache=new Boolean[nums.length];
        
        return dp(0);
    }
}