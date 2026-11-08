class Solution {
    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] rowcount = new int[n];
        int[] colcount = new int[m];
        int total = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    total++;
                    rowcount[i]++;
                    colcount[j]++;
                }
            }
        }
        int isolated = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && rowcount[i]==1 && colcount[j]==1){
                    isolated++;
                }
            }
        }
        return total-isolated;
    }
}