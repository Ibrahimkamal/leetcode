class Solution {
    Map<Integer,Integer> cache=new HashMap<>();

    private int dp(Integer[][]memo,int[]nums,int[]multipliers,int left,int op ){
        int n=nums.length;
        int m=multipliers.length;

        if (m<=op){
            return 0;
        }
        if(memo[left][op]==null)
        {
            int right=n-op-1+left;
            int l=nums[left] * multipliers[op] + dp(memo, nums, multipliers, left+1, op+1);
            int r=nums[right] * multipliers[op] + dp(memo, nums, multipliers, left, op+1);

            memo[left][op]= Math.max(l, r);
        }
        return memo[left][op];
    }

    public int maximumScore(int[] nums, int[] multipliers) {
        int m=multipliers.length;
        Integer[][]memo=new Integer[m+1][m+1];
        return dp(memo,nums,multipliers,0,0);
    }
}