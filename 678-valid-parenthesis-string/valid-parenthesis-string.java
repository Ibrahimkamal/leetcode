class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> openBracket = new Stack<>();
        Stack<Integer> astrecs = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='('){
                openBracket.push(i);
            }else if(c=='*'){
                astrecs.push(i);
            }else if(c==')'){
                if(!openBracket.isEmpty()){
                    openBracket.pop();
                }else if(!astrecs.isEmpty()){
                    astrecs.pop();
                }else{
                    return false;
                }
            }
        }
        while(!openBracket.isEmpty()){
            if(astrecs.isEmpty()){
                return false;
            }else if(astrecs.peek()>openBracket.peek()){
                astrecs.pop();
                openBracket.pop();
            }else{
                return false;
            }
        }
        return true;
    }
}