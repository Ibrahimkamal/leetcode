class Solution {
    public boolean isPalindrome(int x) {
        if (x<0)
            return false;
        String str_temp=Integer.toString(x);
        for(int i=0;i<str_temp.length()/2;i++){
            if(str_temp.charAt(i)!=str_temp.charAt(str_temp.length()-1-i))
                return false;
        }
        return true;
    }
}