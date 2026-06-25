class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] output = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int l_sum=0;
            int r_sum=0;
            for(int j=0;j<i;j++){
                l_sum+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                r_sum+=nums[j];
            }
            output[i]=Math.abs(l_sum-r_sum);
        }
        return output;
    }
}