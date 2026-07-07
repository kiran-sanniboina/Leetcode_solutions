class Solution {
    public long sumAndMultiply(int n) {
        long digit_sum=0;
        long x = 0;
        int m = 1;
        if(n==0){
            return 0;
        }
        while(n>0){
            int digit = n%10;
            if(digit!=0){
                x+=digit*m;
                m*=10;
            }
            digit_sum+=digit;
            n=n/10;
        }
        return digit_sum*x;
    }
}