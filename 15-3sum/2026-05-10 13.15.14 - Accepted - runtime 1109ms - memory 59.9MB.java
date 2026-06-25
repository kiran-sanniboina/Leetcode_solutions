class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> output=new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum>0){
                    right--;
                }
                if(sum<0){
                    left++;
                }
                if(sum==0){
                    List<Integer> temp = Arrays.asList(nums[i],nums[left],nums[right]);
                    Collections.sort(temp);
                    output.add(temp);
                    left++;
                    right--;
                }
            }
        }
        return new ArrayList<>(output);
    }
}