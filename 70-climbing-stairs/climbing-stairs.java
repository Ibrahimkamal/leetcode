class Solution {
    int [] cache;
    private int dp(int n) {
        if (n < 2) {
            return 1;
        }
        if (cache[n] != -1) {
            return cache[n];
        }
        cache[n] = dp(n - 1) + dp(n - 2);
        return cache[n];
    }
    public int climbStairs(int n) {
        cache=new int[n+1];
        for(int i=0;i<=n;i++){
            cache[i]=-1;
        }
        return dp(n);
    }
}