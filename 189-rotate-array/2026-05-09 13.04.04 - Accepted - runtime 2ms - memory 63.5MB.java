class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] arr1=new int[nums.length-k];
        int[] arr2=new int[k];
        for(int i=0;i<nums.length-k;i++){
            arr1[i]=nums[i];
        }
        int l=0;
        for(int i=nums.length-k;i<nums.length && l<=k;i++){
            arr2[l++]=nums[i];
        }
        int[] rotated=new int[nums.length];
        System.arraycopy(arr2,0,rotated,0,arr2.length);
        System.arraycopy(arr1,0,rotated,arr2.length,arr1.length);
        for(int i=0;i<nums.length;i++){
            nums[i]=rotated[i];
        }
    }
}