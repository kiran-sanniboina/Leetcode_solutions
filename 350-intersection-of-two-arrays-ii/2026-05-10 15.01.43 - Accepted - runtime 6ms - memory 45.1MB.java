class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n=nums1.length;
        int m=nums2.length;
        int l=0;
        int r=0;
        int k=0;
        int[] arr=new int[Math.min(n,m)];
        while(l<n && r<m){
            if(nums1[l]<nums2[r]){
                l++;
            }
            else if(nums1[l]>nums2[r]){
                r++;
            }
            else{
                arr[k++]=nums1[l];
                l++;
                r++;
            }
        }
        return Arrays.copyOf(arr,k);
    }
}