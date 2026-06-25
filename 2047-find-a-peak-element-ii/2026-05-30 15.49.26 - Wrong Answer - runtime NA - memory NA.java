class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int l=0;
        int r=mat.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            int row=max(mat,mid);
            int left=(mid-1>=0)?mat[row][mid-1]:-1;
            int right=(mid+1<=r)?mat[row][mid+1]:-1;
            if(mat[row][mid]>left && mat[row][mid]>right){
                return new int[] {row,mid};
            }else if(mat[row][mid]<left){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return new int[] {-1,-1};
    }
    static int max(int[][] mat,int mid){
        int max=-1;
        int index=-1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][mid]>max){
                max=mat[i][mid];
                index=i;
            }
        }
        return index;
    }
}