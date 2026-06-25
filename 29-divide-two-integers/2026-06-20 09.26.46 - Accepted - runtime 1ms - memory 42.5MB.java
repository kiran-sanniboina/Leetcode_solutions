class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend<=Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        int count = 0;
        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        while(n>=d){
            long temp = d;
            int multiple = 1;
            while((temp<<1)<=n){
                temp<<=1;
                multiple<<=1;
            }
            n-=temp;
            count+=multiple;
        }
        if((dividend<0)^(divisor<0)){
            count= -count;
        }
        return count;
    }
}