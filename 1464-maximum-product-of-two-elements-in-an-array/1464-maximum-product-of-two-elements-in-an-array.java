class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            int val1 = nums[i]-1;
            for(int j=i+1;j<nums.length;j++){
                int val2 = nums[j]-1;
                max=Math.max(max,val1*val2);
            }
        }
        return max;
    }
}