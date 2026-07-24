class Solution {
    public int uniqueXorTriplets(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> pairs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                pairs.add(nums[i]^nums[j]);
            }
        }
        for(int i:pairs){
            for(int j:nums){
                set.add(i^j);
            }
        }
        return set.size();
    }
}