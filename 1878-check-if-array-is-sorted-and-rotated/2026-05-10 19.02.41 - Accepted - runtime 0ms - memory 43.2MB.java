class Solution {
    public boolean check(int[] nums) {
        int n=0;
        int x=1;
        while(n<nums.length-1 && nums[n]<=nums[n+1]){
            x++;
            n++;
        }
        int[] arr=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[(i+x)%arr.length];
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}