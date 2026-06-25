class check{
    static boolean div_sum(int[] arr,int val,int threshold){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/val);
        }
        return (sum<=threshold);
    }
}
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int r=nums[0];
        for(int i=1;i<nums.length;i++){
            r=Math.max(nums[i],r);
        }
        int small=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(check.div_sum(nums,mid,threshold)){
                small=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return small;
    }
}