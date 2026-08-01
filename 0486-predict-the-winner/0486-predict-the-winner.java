class Solution {
    Integer[][] dp;
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        dp = new Integer[n][n];
        return f(0,n-1,nums)>=0;
    }
    int f(int i,int j, int[] nums){
        if(i==j){
            return nums[i];
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        return dp[i][j]=Math.max(nums[i]-f(i+1,j,nums),nums[j]-f(i,j-1,nums));
    }
}