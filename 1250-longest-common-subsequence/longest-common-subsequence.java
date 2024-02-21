class Solution {
    private int [][]cache;
    private String text1;
    private String text2;
    private int dp(int index1, int index2) {
        // int m=text1.length();
        // int n=text2.length();
        // if (index1 > m || index2 > n) {
        //     return 0;
        // }
        if (cache[index1][index2]==-1)
        {
            int option1=dp(index1+1,index2);

            int firstOccurance=text2.indexOf(text1.charAt(index1),index2);
            int option2=0;

            if(firstOccurance!=-1)
            {
                option2=1+dp(index1+1,firstOccurance+1);
            }
            cache[index1][index2]=Math.max(option1, option2);
            
        }
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