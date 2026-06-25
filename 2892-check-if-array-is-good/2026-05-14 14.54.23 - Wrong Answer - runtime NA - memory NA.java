class Solution {
    public boolean isGood(int[] nums) {
        int sum = 0;
        int max = 0;
        int n=nums.length-1;
        for(int i=0;i<=n;i++){
            sum+=nums[i];
            if(nums[i]==n){
                max++;
            }
        }
        return (((n*(n+1)/2)+n)==sum && max==2)?true:false;
    }
}