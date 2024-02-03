class Solution {
    private Map<Integer,Integer> memo=new HashMap<>();

    private int dp(int i,int[] cost)
    {
        if(i<=1)
        {
            return 0;
        }
        if (!memo.containsKey(i))
        {
            int oneDown= cost[i-1]+dp(i-1,cost);
            int twoDown= cost[i-2]+dp(i-2,cost);
            memo.put(i,Math.min(oneDown,twoDown));
        }

        return memo.get(i);
    }
    public int minCostClimbingStairs(int[] cost) {

        return dp(cost.length,cost);
    }
}