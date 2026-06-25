class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
            return;
        }
        if(n==0){
            return;
        }
        int[] arr=new int[m+n];
        int l1=0;
        int l2=0;
        int k=0;
        while(l1<m && l2<n){
            if(nums1[l1]>nums2[l2]){
                arr[k++]=nums2[l2++];
            }
            else{
                arr[k++]=nums1[l1++];
            }
        }
        while(l1<m){
            arr[k++]=nums1[l1++];
        }
        while(l2<n){
            arr[k++]=nums2[l2++];
        }
        for(int i=0;i<(m+n);i++){
            nums1[i]=arr[i];
        }

    }
}