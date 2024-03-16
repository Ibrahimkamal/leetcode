class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int result=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                sum+=nums[i];
            }else{
                sum--;
            }
            if(map.containsKey(sum))
            {
                result=Math.max(result,i-map.get(sum));
                continue;
            }
            map.put(sum,i);
        }
        return result;
    }
}
//1 1 0 1 0 1 0 1 0 1