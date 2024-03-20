class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map=new HashMap<>();
        for(String str:strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            List l=map.getOrDefault(key,new ArrayList<String>());
            l.add(str);
            map.put(key,l);
        }
        return new ArrayList(map.values());
    }
}