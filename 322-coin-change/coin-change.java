class Solution {

    HashMap<Integer,Integer>cache;
    int[] coins;

    public int dp(int amount) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        if (cache.containsKey(amount)) {
            return cache.get(amount);
        }
        
        int min = Integer.MAX_VALUE;
        for (int coin : this.coins) {
            int result = dp(amount - coin);
            if (result >= 0 && result < min) {
                min = result + 1;
            }
        }
        
        cache.put(amount, (min == Integer.MAX_VALUE) ? -1 : min);
        return cache.get(amount);
    }
    public int coinChange(int[] coins, int amount) {
        cache=new HashMap<>();
        this.coins=coins;
        return dp(amount);
    }
}