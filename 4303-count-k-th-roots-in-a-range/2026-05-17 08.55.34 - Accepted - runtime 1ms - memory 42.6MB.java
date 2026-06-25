class Solution {
    public int countKthRoots(int l, int r, int k) {
        int left = (int)Math.ceil(Math.pow(l,1.0/k));
        int right = (int)Math.floor(Math.pow(r,1.0/k));
        if(Math.pow(left,k)<l){
            left++;
        }
        if(Math.pow(right,k)>r){
            right--;
        }
        if(Math.pow(right+1,k)<=r){
            right++;
        }
        return Math.max(0,right-left+1);
    }
}