class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int r=0;
        int l=0;
        for(int i=0;i<weights.length;i++){
            r+=weights[i];
            l=Math.max(l,weights[i]);
        }
        int ans=r;
        while(l<=r){
            int mid=(l+r)/2;
            if(days(weights,mid)<=days){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    static int days(int[] arr,int val){
        int days=1;
        int load=0;
        for(int i=0;i<arr.length;i++){
            if((load+arr[i])>val){
                days++;
                load=arr[i];
            }else{
                load+=arr[i];
            }
        }
        return days;
    }
}