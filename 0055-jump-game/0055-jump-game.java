class Solution {
    public boolean canJump(int[] nums) {
        int maxidx = 0;
        for(int i=0;i<nums.length;i++){
            if(i>maxidx){
                return false;
            }
            int jump = i+nums[i];
            maxidx = Math.max(jump,maxidx);
        }
        return true;
    }
}