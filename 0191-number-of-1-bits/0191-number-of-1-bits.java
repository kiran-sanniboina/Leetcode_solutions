class Solution {
    public int hammingWeight(int n) {
        int r = 0;
        int count = 0;
        while(n>0){
            r=n%2;
            n=n/2;
            if(r==1){
                count++;
            }
        }
        return count;
    }
}