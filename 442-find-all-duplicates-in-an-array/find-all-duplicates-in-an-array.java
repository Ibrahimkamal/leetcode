class Solution {
    private void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        while(n>i){
            int num=nums[i];
            int correct_index=num-1;

            if(num!=nums[correct_index]){
                swap(nums,i,correct_index);
            }else{
                i++;
            }
        }
        List<Integer> result=new ArrayList<>();

        for(i=0;i<n;i++){
            if(nums[i]-1!=i){
                result.add(nums[i]);
            }
        }
        return result;
    }
}