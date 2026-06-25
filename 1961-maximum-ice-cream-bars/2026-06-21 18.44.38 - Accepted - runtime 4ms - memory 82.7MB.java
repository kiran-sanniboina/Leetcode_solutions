class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = 0;
        for(int cost:costs){
            max=Math.max(max,cost);
        }
        int[] count = new int[max+1];
        int result = 0;
        for(int cost:costs){
            count[cost]++;
        }
        for(int i=1;i<=max;i++){
            if(count[i]==0){
                continue;
            }
            int  bars = Math.min(count[i],coins/i);
            result+=bars;
            coins-=(bars*i);
            if(i>coins){
                break;
            }
        }
        return result;
    }
}