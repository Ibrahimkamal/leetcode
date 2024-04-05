class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if(Math.abs(stack.peek()-s.charAt(i))==Math.abs('a'-'A')){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        String result="";
        for(char c:stack){
            result+=c;
        }
        return result;
    }
}