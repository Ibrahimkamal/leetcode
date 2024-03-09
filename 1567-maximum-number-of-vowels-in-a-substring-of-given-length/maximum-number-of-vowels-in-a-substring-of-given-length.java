class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int result=0;
        for(int i=0;i<k;i++){
            if (set.contains(s.charAt(i))){
                result+=1;
            }
        }
        int sum=result;
        for(int i=1;i<=s.length()-k;i++){
            if (set.contains(s.charAt(i-1))){
                sum--;
            }
            if (set.contains(s.charAt(i+k-1))){
                sum++;
            }
            result=Math.max(result, sum);
        }
        return result;
    }
}