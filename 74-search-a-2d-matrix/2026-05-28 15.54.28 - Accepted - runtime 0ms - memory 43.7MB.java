class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0;
        int r=n*m-1;
        while(l<=r){
            int mid=(l+r)/2;
            int i=mid/n;
            int j=mid%n;
            if(matrix[i][j]==target){
                return true;
            }
            if(target>matrix[i][j]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return false;
    }
}