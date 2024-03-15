class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int sums[] = new int[nums.length+1];
        for(int i=1;i<=nums.length;i++)
            sums[i] = nums[i-1]+sums[i-1];
        
        int maxValue_1 = 0;
        int ans=0;
        for(int i=firstLen;i<=nums.length-secondLen;i++)
        {
            maxValue_1 = Math.max(maxValue_1,sums[i]-sums[i-firstLen]);
            ans = Math.max(ans,sums[i+secondLen]-sums[i]+maxValue_1);
        }
        int maxValue_2 = 0 ;
        for(int i=secondLen;i<=nums.length-firstLen;i++)
        {
            maxValue_2 = Math.max(maxValue_2,sums[i]-sums[i-secondLen]);
            ans = Math.max(ans,sums[i+firstLen]-sums[i]+maxValue_2);
        }
        return ans;
    }
}