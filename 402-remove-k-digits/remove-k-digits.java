class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {
            while(stack.size()>0 && k>0 && stack.peek()>digit){
                stack.pop();
                k-=1;
            }
            stack.push(digit);
        }
        for(int i=0;i<k;i++){
            stack.pop();
        }

        StringBuilder ret=new StringBuilder();
        boolean leadingZero=true;
        for (char c:stack){
            if(leadingZero==true && c=='0')continue;
            leadingZero=false;
            ret.append(c);
        }
        if(ret.length()==0)return "0";
        return ret.toString();

    }
}