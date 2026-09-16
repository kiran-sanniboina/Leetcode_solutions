class Solution {
    public int numberOfSets(int n, int k) {
        int mod = 1000000007;
        long[][] dp = new long[n][k+1];
        long[][] prefix = new long[n][k+1];
        for(int i=0; i<n;i++){
            dp[i][0]=1;
        }
        prefix[0][0]=dp[0][0];
        for(int i=1;i<n;i++){
            prefix[i][0]=(prefix[i-1][0]+dp[i][0])%mod;
        }
        for(int j=1;j<=k;j++){
            for(int i=0;i<n;i++){
                long notrightend = (i>0)?dp[i-1][j]:0;
                long isrightend = (i>0)?prefix[i-1][j-1]:0;
                dp[i][j]=(notrightend+isrightend)%mod;
            }
            prefix[0][j]=dp[0][j];
            for(int i=1;i<n;i++){
                prefix[i][j]=(prefix[i-1][j]+dp[i][j])%mod;
            }
        }
        return (int)dp[n-1][k];
    }
}