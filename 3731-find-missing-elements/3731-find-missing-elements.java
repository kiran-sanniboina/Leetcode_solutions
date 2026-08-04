class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        List<Integer> list1 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
            list1.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!list1.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}