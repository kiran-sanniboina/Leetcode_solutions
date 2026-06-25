class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max_sum=max_sum<sum?sum:max_sum;
            sum=sum<0?0:sum;
        }
        return max_sum;
    }
}