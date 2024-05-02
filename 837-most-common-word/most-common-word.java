class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[]arr=paragraph.replaceAll("[^a-zA-Z ]"," ").toLowerCase().split("\\s+");
        HashMap<String,Integer> map=new HashMap<>();
        HashSet<String> bannedSet=new HashSet<>();
        for(String s:banned){
            bannedSet.add(s.toLowerCase());
        }

        for(String s:arr){
            int count=map.getOrDefault(s,0)+1;
            s=s.toLowerCase();
            map.put(s,count);
        }
        int max=0;
        String mostRepeadWord="";
        for(String word:map.keySet()){
            if(bannedSet.contains(word))
                continue;
            int curr=map.get(word);
            if(max<curr)
            {
                max=map.get(word);
                mostRepeadWord=word;
            }
        }
        return mostRepeadWord;                                     
    }
}