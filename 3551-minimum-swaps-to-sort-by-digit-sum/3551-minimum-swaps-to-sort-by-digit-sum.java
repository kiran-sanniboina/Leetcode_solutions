class Solution {
    public int minSwaps(int[] nums) {
        Integer[] arr = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr,(a,b)->{
            int x = digitsum(a);
            int y = digitsum(b);
            if(x==y){
                return Integer.compare(a,b);
            }
            return Integer.compare(x,y);
        });

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        int i = 0;
        int swaps = 0;
        while(i<arr.length){
            if(map.get(nums[i])==i){
                i++;
            }else{
                swaps++;
                int j = map.get(nums[i]);
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return swaps;
    }
    private int digitsum(int n){
        if(n==0){
            return 0;
        }
        return n%10 + digitsum(n/10);
    }
}