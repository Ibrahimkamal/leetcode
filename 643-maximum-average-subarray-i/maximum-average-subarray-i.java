class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int j=0;j<k;j++){
                sum+=nums[j];
        }
        double result=sum;
        for(int i=1;i<=nums.length-k;i++){
            int new_val=nums[i+k-1];
            int old_val=nums[i-1];
            sum=sum+new_val-old_val;
            result=Math.max(sum,result);
        }
        return result/k;
    }
}