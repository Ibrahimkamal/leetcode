class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Character> map_s=new HashMap<>();
        Map<Character,Character> map_t=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            map_s.put(s.charAt(i),' ');
        }
        for(int i=0;i<t.length();i++)
        {
            map_t.put(t.charAt(i),' ');
        }
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(map_s.get(c1)==' ' && map_t.get(c2)==' '){
                map_s.put(c1,c2);
                map_t.put(c2,c1);
            }else if(map_s.get(c1)==c2 && map_t.get(c2)==c1){
                continue;
            }else{
                return false;
            }
        }

        return true;
    }
}