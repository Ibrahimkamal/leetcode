class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // find row
        int m=matrix.length;
        int n=matrix[0].length;
        if(target<matrix[0][0] || target>matrix[m-1][n-1])
            return false;

        int left=0;
        int right=m-1;
        int mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(matrix[mid][0]==target)
                return true;
            if(matrix[mid][0]>target)//go left
                right=mid-1;
            else // go right
                left=mid+1;
        }
        int target_row=left-1;
        left=0;
        right=n-1;
        mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(matrix[target_row][mid]==target)
                return true;
            if(matrix[target_row][mid]>target)//go left
                right=mid-1;
            else // go right
                left=mid+1;
        }
        return false;
    }
}