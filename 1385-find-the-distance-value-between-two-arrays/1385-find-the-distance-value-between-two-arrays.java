class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int n = arr1.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int val = arr1[i];
            int near = nearest(arr2,val);
            if(Math.abs(val-near)>d){
                count++;
            }
        }
        return count;
    }
    private int nearest(int[] arr,int val){
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(val==arr[mid]){
                return arr[mid]; 
            }else if(val>arr[mid]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        
        if(j<0){
            return arr[0];
        }
        if(i>=arr.length){
            return arr[arr.length-1];
        }
        int val1 = Math.abs(val-arr[i]);
        int val2 = Math.abs(val-arr[j]);
        return (val1>val2)?arr[j]:arr[i];
    }
}