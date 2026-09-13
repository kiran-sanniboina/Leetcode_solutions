class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int overlap = 0;
        for(int i=-n;i<n;i++){
            for(int j=-n;j<n;j++){
                int count = count(img1,img2,i,j);
                overlap=Math.max(count,overlap);
            }
        }
        return overlap;
    }
    private int count(int[][] A,int[][] B, int r, int c){
        int n = A.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i+r)>=n || (j+c)>=n || (i+r)<0 || (j+c)<0){
                    continue;
                }
                if(A[i+r][j+c]==1 && B[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}