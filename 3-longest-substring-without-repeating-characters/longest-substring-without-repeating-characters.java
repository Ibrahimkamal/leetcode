class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int result = 0;
        int start = 0;
        int end = 0;
        while (end < s.length()) {
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            end++;
            result = Math.max(result, end - start);
            
        }
        return result;

    }
}