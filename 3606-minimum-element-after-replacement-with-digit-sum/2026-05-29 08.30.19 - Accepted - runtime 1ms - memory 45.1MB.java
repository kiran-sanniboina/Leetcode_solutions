class Solution {
    public int minElement(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int n=nums[i];
            while(n>0){
                int digit=n%10;
                sum+=digit;
                n=n/10;
            }
            arr[i]=sum;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
}