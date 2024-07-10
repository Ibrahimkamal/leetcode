class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        ArrayList<Integer> arr=new ArrayList<>(set);
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return set.size();
    }
}
// 0,1,0,1,1,2,2,3,3,4