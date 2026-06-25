class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            int missing=arr[mid]-1-mid;
            if(missing>=k){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l+k;
    }
}