class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> lookup= new HashSet<> ();
        List<Integer> result= new ArrayList<> ();

        for(int i=0;i<nums.length;i++){
            if(lookup.contains(nums[i])){
                result.add(nums[i]);
            }else{
                lookup.add(nums[i]);
            }

        }
        return result;
    }
}