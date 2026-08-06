class Solution {
    public int smallestNumber(int n, int t) {
        int i=n;
        while(i>=n){
            int product=1;
            int val = i;
            while(val!=0){
                int digit=val%10;
                product*=digit;
                val/=10;
            }
            if(product%t==0){
                return i;
            }
            i++;
        }
        return -1;
    }
}