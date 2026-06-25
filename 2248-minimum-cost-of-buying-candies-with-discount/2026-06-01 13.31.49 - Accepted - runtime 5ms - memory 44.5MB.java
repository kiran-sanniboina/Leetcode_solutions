class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int min_sum=0;
        int take=0;
        for(int i=cost.length-1;i>=0;i--){
            if(take<2){
                min_sum+=cost[i];
                take++;
            }else{
                take=0;
            }
        }
        return min_sum;
    }
}