class Solution {
    public int pivotInteger(int n) {
        int total_sum = 0;
        total_sum=n*(n+1)/2;
        int current_sum=0;
        for (int i = 0; i <= n; i++) {
            current_sum += i;
            if(current_sum==total_sum-current_sum+i){
                return i;
            }else if(current_sum>total_sum-current_sum){
                return -1;
            }
        }
        return -1;
    }
}