class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentMax=nums[0];
        int totalMax=nums[0];

        int currentMin=nums[0];
        int totalMin=nums[0];

        int total=nums[0];
        for(int i=1;i<nums.length;i++){
            int num=nums[i];

            total+=num;

            currentMax=Math.max(currentMax+num,num);
            totalMax=Math.max(currentMax, totalMax);

            currentMin=Math.min(currentMin+num,num);
            totalMin=Math.min(currentMin, totalMin);
        }
        if(totalMax<0){
            return totalMax;
        }
        return Math.max(totalMax, total-totalMin);
    }
}