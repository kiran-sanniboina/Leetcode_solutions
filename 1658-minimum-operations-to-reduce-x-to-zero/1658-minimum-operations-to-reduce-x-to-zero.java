class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0;
        for(int i:nums){
            total+=i;
        }
        int target = total - x;
        int left = 0;
        int sum = 0;
        int maxlen = -1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(left<=i && sum>target){
                sum-=nums[left++];
            }
            if(sum==target){
                maxlen=Math.max(maxlen,i-left+1);
            }
        }
        return maxlen == -1 ? -1:nums.length-maxlen;
    }
}