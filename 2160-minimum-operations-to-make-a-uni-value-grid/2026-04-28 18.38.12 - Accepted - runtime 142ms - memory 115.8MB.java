class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> array= new ArrayList<>();
        int res = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                array.add(grid[i][j]);
            }
        }
        Collections.sort(array);
        int length = array.size();
        int fc_num = array.get(length/2);
        for(int num:array){
            if(num%x!=fc_num%x){
                return -1;
            }
            res+=Math.abs(fc_num-num)/x;
        }
        return res;
    }
}