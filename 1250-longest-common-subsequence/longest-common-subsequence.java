class Solution {
    private int [][]cache;
    private String text1;
    private String text2;
    private int dp(int index1, int index2) {
        if (cache[index1][index2]!=-1)
        {
            return cache[index1][index2];
        }
        int answer=0;
        if (text1.charAt(index1)==text2.charAt(index2))
        {
            answer=1+ dp(index1+1,index2+1);

        }else{
            int val1=dp(index1+1,index2);
            int val2=dp(index1,index2+1);

            answer=Math.max(val1, val2);
        }
        
        cache[index1][index2]=answer;
        
        return cache[index1][index2];
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();

        cache=new int[m+1][n+1];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                cache[i][j]=-1;
            }
        }
        this.text1=text1;
        this.text2=text2;
        return dp(0, 0);
    }
}