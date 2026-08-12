class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l = 0;
        int maxlen = 0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.get(nums[i])>k){
                map.put(nums[l],map.get(nums[l])-1);
                l++;
            }
            maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}