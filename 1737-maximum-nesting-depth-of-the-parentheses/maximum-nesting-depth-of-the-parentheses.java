class Solution {
    public int maxDepth(String s) {
        Set<Character> set = Set.of('+', '-', '*', '/', '(', ')');
        Stack<Character> stack=new Stack<>();
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else if(s.charAt(i)==')'){
                count--;
            }
            max=Math.max(max,count);

            // if (count<0){
            //     return 0;
            // }
        }
        return max;
    }
}