class Solution {
    public int largestInteger(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int num:nums){
            max=Math.max(max,num);
        }
        int[] freq = new int[max+1];
        for(int num:nums){
            freq[num]++;
        }
        int max1 = Integer.MIN_VALUE;
        for(int num:nums){
            if(freq[num]==1){
                max1=Math.max(max1,num);
            }
        }
        if(k==1){
            return max1>0?max1:-1;
        }
        if(k==n){
            return max;
        }
        int val = -1;
        if(freq[nums[0]]==1 && freq[nums[n-1]]==1){
            val = Math.max(nums[0],nums[n-1]);
        }else if(freq[nums[0]]==1){
            return nums[0];
        }else if(freq[nums[n-1]]==1){
            return nums[n-1];
        }
        return val;
    }
}