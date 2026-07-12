class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] nums = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        int[] out = new int[arr.length];
        Arrays.sort(nums);
        int temp = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],temp++);
            }
        }
        for(int i=0;i<arr.length;i++){
            out[i]=map.get(arr[i])+1;
        }
        return out;
    }
}