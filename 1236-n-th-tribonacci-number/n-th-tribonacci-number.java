class Solution {
    private Map<Integer,Integer> memo=new HashMap<>();
    private int dp(int i){
        if(i==0){
            return 0;
        }else if(i==1){
            return 1;
        }
        else if(i==2){
            return 1;
        }
        if (!memo.containsKey(i)){
            memo.put(i,dp(i-1)+dp(i-2)+dp(i-3));
        }
        return memo.get(i);
    }
    public int tribonacci(int n) {
        return dp(n);

    }
}