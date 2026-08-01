class Solution {
    public boolean predictTheWinner(int[] nums) {
        return f(0,nums.length-1,nums)>=0;
    }
    static int f(int i,int j, int[] nums){
        if(i==j){
            return nums[i];
        }
        return Math.max(nums[i]-f(i+1,j,nums),nums[j]-f(i,j-1,nums));
    }
}