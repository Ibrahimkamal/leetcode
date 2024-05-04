class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> result=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int low=i+1;
            int high=nums.length-1;
            while(low<high){
                if(nums[i]+nums[low]+nums[high]==0){
                    result.add(new ArrayList<>(Arrays.asList(nums[i],nums[low],nums[high])));
                    low++;
                }else if(nums[i]+nums[low]+nums[high]<0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return  new ArrayList<>(result);

    }
}