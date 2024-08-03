class Solution {
    Integer[][]memo;
    List<List<Integer>> triangle;
    private int dp(int i,int j){
        if(i==triangle.size()-1)
            return triangle.get(i).get(j);
        if(j<0 || j>=triangle.get(i).size())
            return Integer.MAX_VALUE;
        if(memo[i][j]!=null)
            return memo[i][j];
        int left=dp(i+1,j);
        int right=dp(i+1,j+1);
        memo[i][j]=Math.min(left,right)+triangle.get(i).get(j);
        return memo[i][j];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        this.triangle=triangle;
        this.memo=new Integer[triangle.size()][triangle.getLast().size()];
        return dp(0,0);
    }
}