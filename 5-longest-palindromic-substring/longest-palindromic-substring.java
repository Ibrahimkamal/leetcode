class Solution {
    private boolean idPalindrom(String s){
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int len=s.length();
        if(len<=1)
            return s;
        int max=0;
        String result="";
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<=len;j++){
                String substr=s.substring(i,j);
                if(idPalindrom(substr) && max<j-i)
                {
                    max=j-i;
                    result=substr;
                }
            }
        }
        return result;
    }
}