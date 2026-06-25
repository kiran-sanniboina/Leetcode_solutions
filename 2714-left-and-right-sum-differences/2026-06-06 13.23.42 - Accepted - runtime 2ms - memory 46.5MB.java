class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] output = new int[nums.length];
        int l_sum=0;
        int r_sum=0;
        for(int i=0;i<nums.length;i++){
            r_sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            r_sum-=nums[i];
            output[i]=Math.abs(l_sum-r_sum);
            l_sum+=nums[i];
        }
        return output;
    }
}