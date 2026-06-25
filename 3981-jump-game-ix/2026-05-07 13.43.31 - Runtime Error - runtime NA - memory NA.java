class Solution {
    public int[] maxValue(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            j=i+1;
            if(nums[i]>nums[j]){
                nums[j]=nums[i];
                j++;
            }
        }
        return nums;
    }
}