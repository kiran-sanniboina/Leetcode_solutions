class Solution {
    public boolean sumGame(String num) {
        int sum1 = 0;
        int sum2 = 0;
        int q1 = 0;
        int q2 = 0;
        int n = num.length();
        for(int i = 0;i<n/2;i++){
            char a = num.charAt(i);
            char b = num.charAt(i+n/2);
            if(a=='?'){
                q1++;
            }else{
                sum1+=a-'0';
            }
            if(b=='?'){
                q2++;
            }else{
                sum2+=b-'0';
            }
        }
        return (sum1-sum2)*2!=(q2-q1)*9;
    }
}