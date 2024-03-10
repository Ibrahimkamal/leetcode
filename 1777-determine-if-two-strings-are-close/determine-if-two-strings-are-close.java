class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.equals(word2)){
            return true;
        }
        if(word1.length()!=word2.length() ||word2.length()==1 )
        {
            return false;
        }
        Map<Character,Integer> map1=new TreeMap<>();
        Map<Character,Integer> map2=new TreeMap<>();

        for(int i=0;i<word1.length();i++){
            int val=map1.getOrDefault(word1.charAt(i), 0);
            map1.put(word1.charAt(i), val+1);
        }
        int diff=1;
        for(int i=0;i<word2.length();i++){
            int val=map2.getOrDefault(word2.charAt(i), 0);
            char key=word2.charAt(i);
            map2.put(word2.charAt(i), val+1);
            if(!map1.containsKey(key)){
                diff-=1;
            }
        }
        if(diff<0){
            return false;
        }
        ArrayList<Integer> arr1=new ArrayList<>(map1.values());
        ArrayList<Integer> arr2=new ArrayList<>(map2.values());
        Collections.sort(arr1);
        Collections.sort(arr2);

        return arr1.equals(arr2);

    }
}