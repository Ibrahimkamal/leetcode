class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> result=new HashSet<>();

        for(int num :nums2){
            set.add(num);
        }
        for(int num : nums1){
            if(set.contains(num)){
                result.add(num);
            }
        }
        int[] finalResult=new int[result.size()];
        int i=0;
        for(Integer num :result){
            finalResult[i]=num;
            i++;
        }
        return finalResult;
        
    }
}