class Solution {
    public int singleNumber(int[] nums) {
        int total_sum=0;
        int sum=0;
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
            total_sum+=i;
        }
        for(int i:set){
            sum+=i;
        }
        return 2*sum-total_sum;
    }
}