class Solution {
    public int [] shiftLeft(int[]nums,int index)
    {
        for(int j=index+1;j<nums.length;j++)
        {
            nums[j-1]=nums[j];
        }
        return nums;
    }
    public int removeDuplicates(int[] nums) {
        int i=1;
        int length=nums.length;
        int count=1;
        while(i<length)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
                if(count>2)
                {
                    this.shiftLeft(nums, i);
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