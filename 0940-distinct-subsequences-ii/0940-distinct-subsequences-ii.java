class Solution {
    
    public int distinctSubseqII(String s) {
        int mod = 1000000007;
        int n = s.length();
        int[] dp = new int[n+1];
        int[] last = new int[26];
        Arrays.fill(last,0);
        dp[0]=1;
        for(int i=1;i<=n;i++){
            char ch = s.charAt(i-1);
            int val = ch - 'a';
            dp[i]=(2*dp[i-1])%mod;
            if(last[val]!=0){
                dp[i]=(dp[i]-dp[last[val]-1]+mod)%mod;
            }
            last[val]=i;
        }

        return (dp[n]-1+mod)%mod;
    }
}