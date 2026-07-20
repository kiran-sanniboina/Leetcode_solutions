class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] arr = new int[grid.length*grid[0].length];
        List<List<Integer>> list = new ArrayList<>();
        int l = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                arr[l++]=grid[i][j];
            }
        }
        int n = arr.length;
        int[] temp = new int[n];
        k%=n;
        for(int i=0;i<n;i++){
            temp[(i+k)%n]=arr[i];
        }
        l=0;
        for(int i=0;i<grid.length;i++){
            List<Integer> list1 = new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                list1.add(temp[l++]);
            }
            list.add(list1);
        }
        return list;
    }
}