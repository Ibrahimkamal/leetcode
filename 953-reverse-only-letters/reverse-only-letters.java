
class Solution {
    private boolean isCharacter(char c) {
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    public String reverseOnlyLetters(String s) {
        int start=0;
        int end=s.length()-1;
        char[] arr=s.toCharArray();
        while(start<=end){
            if(isCharacter(arr[start]) && isCharacter(arr[end]))
            {
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }else if(!isCharacter(arr[start])){
                start++;
            }else if(!isCharacter(arr[end])){
                end--;
            }
        }
        
        return new String(arr);
    }
}
