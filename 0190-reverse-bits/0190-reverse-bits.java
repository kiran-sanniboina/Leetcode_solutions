class Solution {
    public int reverseBits(int n) {
        int out = 0;
        int i = 32;
        while(n>0){
            out = (out<<1) + (n%2);
            n/=2;
            i--;
        }
        while(i>0){
            out = out<<1;
            i--;
        }
        return out;
    }
}