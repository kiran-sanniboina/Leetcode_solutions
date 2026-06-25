class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0;
        int r=0;
        for(int i=0;i<nums.length;i++){
            l=Math.min(l,nums[i]);
            r+=nums[i];
        }
        int ans=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(split(nums,mid,k)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans-1;
    }
    static boolean split(int[] arr,int mid,int k){
        int sum=0;
        int split=1;
        for(int i=0;i<arr.length;i++){
            if((sum+arr[i])<mid){
                sum+=arr[i];
            }else{
                split++;
                sum=+arr[i];
            }
        }
        return(split<=k);
    }
}