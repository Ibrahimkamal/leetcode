class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result=new ArrayList<>();
        

        List<Integer> nums1_list=new ArrayList<>();
        List<Integer> nums2_list=new ArrayList<>();
                for(int num : nums1){
                nums1_list.add(num);
                }
        for(int num : nums2){
                nums2_list.add(num);
        }

        List<Integer> r1=new ArrayList<>();
        List<Integer> r2=new ArrayList<>();
        for(int num : nums1){
            if(!nums2_list.contains(num) && !r1.contains(num)){
                r1.add(num);
            }
        }
        for(int num : nums2){
            if(!nums1_list.contains(num) && !r2.contains(num)){
                r2.add(num);
            }
        }
        result.add(r1);
        result.add(r2);
        return result;
    }
}