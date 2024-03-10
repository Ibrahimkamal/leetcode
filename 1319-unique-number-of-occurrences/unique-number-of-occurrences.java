class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num : arr){
            int val=map.getOrDefault(num, 0);
            map.put(num, val+1);
        }
        Set <Integer> set=new HashSet<>(map.values());
        return set.size()==map.values().size()?true:false;

    }
}