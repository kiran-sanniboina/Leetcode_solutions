class check{
    static boolean bouquets(int[] arr,int days,int m, int k){
        int count=0;
        int t_bouquets=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=days){
                count++;
            }else{
                t_bouquets+=(count/k);
                count=0;
            }
        }
        t_bouquets+=(count/k);
        return (t_bouquets>=m)?true:false;
    }
}
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length-1){
            return -1;
        }
        int l=bloomDay[0];
        int r=bloomDay[0];
        for(int i=1;i<bloomDay.length;i++){
            r=Math.max(r,bloomDay[i]);
            l=Math.min(l,bloomDay[i]);
        }
        int min_days=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(check.bouquets(bloomDay,mid,m,k)){
                min_days=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return min_days;
    }
}