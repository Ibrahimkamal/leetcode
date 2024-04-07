class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int result=0;
        for(int start=0,end=0;end<s.length();end++){
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end), 0)+1);
            while(map.keySet().size()>2){
                map.put(s.charAt(start),map.getOrDefault(s.charAt(start), 0)-1);
                if(map.get(s.charAt(start))==0){
                    map.remove(s.charAt(start));
                }
                start++;
            }
            result=Math.max(result, end-start+1);
        }
        return result;
    }
}