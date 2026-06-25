class Solution {
    public int countKthRoots(int l, int r, int k) {
        int count = 0;
        for (int i = 1; i <= r && Math.pow(i,k)<=r; i++) {
            long val = (long)Math.pow(i, k);
            if (val >= l && val <= r) {
                count++;
            }
        }
        return count;
    }
}