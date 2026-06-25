class Solution {
    public int countKthRoots(int l, int r, int k) {
        int left = (int)Math.ceil(Math.pow(l,1/k));
        int right = (int)Math.floor(Math.pow(r,1/k));
        return Math.max(0,right-left+1);
    }
}