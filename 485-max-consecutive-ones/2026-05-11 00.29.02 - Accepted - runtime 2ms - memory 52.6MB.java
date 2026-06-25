class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c1++;
            }
            else{
                c2=Math.max(c1,c2);
                c1=0;
            }
        }
        return Math.max(c1,c2);
    }
}