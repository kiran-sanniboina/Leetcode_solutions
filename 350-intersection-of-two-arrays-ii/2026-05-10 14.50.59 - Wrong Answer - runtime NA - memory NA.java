class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n=nums1.length;
        int m=nums2.length;
        int l=0;
        int r=0;
        List<Integer> list=new ArrayList<>();
        while(l<n && r<m){
            if(nums1[l]<nums2[r]){
                l++;
            }
            else if(nums1[l]>nums2[r] && n<m){
                r++;
            }
            else{
                list.add(nums1[l]);
                l++;
                r++;
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}