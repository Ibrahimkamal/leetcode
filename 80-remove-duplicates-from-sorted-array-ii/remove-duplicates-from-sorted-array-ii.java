class Solution {
    private void shift(int[]nums,int i)
    {
        for(int j=i+1;j<nums.length;j++)
        {
            nums[j-1]=nums[j];
        }
    }
    public int removeDuplicates(int[] nums) {
        int ptr=1;
        int i=1;
        int length=nums.length;
        int count=1;
        while(i<length)
        {
            if(nums[i-1]==nums[i])
            {
                count++;
                if(count>2)
                {
                    this.shift(nums, i);
                    i--;
                    length--;
                }
                
            }else{
                    count=1;
            }
            i++;
        }
        return length;
        
    }
}