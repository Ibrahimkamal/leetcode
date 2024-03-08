class Solution {
    public String reverseWords(String s) {
        String[] splited_string=s.split("\\s+");
        ArrayDeque <String> stack=new ArrayDeque<>();
        for(String temp:splited_string){
            if (temp!=""){
                stack.push(temp);
            }
        }
        String result="";
        while (stack.size()>1){
            result+=stack.pop()+" ";
        }
        
        return result+stack.pop();

    }
}