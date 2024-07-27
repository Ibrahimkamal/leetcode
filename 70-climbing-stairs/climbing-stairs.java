class Solution {
    int [] cache;
    private int dp(int n) {
        if (n < 2) {
            return 1; // Base case: 1 way to climb 0 or 1 step
        }
        if (cache[n] != -1) {
            return cache[n];
        }
        cache[n] = dp(n - 1) + dp(n - 2); // Number of ways to climb to the nth step
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