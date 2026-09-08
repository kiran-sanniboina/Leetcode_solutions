class Solution {
    public int countCommas(int n) {
        if(n>1000){
            return n-999;
        }else if(n==1000){
            return 1;
        }
        return 0;
    }
}