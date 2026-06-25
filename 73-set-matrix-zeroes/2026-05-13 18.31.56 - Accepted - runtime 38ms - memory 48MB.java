class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int row=0;row<rows.size();row++){
            for(int i=0;i<matrix[0].length;i++){
                matrix[rows.get(row)][i]=0;
            }
        }
        for(int col=0;col<cols.size();col++){
            for(int i=0;i<matrix.length;i++){
                matrix[i][cols.get(col)]=0;
            }
        }
    }
}