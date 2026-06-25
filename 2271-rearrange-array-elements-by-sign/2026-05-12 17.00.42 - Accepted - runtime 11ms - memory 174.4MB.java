class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=(i%2==0)?pos.get(i/2):neg.get(i/2);
        }
        return nums;
    }
}