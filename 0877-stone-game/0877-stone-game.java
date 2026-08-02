class Solution {
    Integer dp[][];
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        dp = new Integer[n][n];
        return f(0,n-1,piles)>=0;
    }
    int f(int i,int j, int[] piles){
        if(i==j){
            return piles[i];
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        return dp[i][j]=Math.max(piles[i]-f(i+1,j,piles),piles[j]-f(i,j-1,piles));
    }
}