class hours{
    static int totalhours(int[] arr,int h){
        int hours=0;
        for(int i=0;i<arr.length;i++){
            hours+=Math.ceil((double)arr[i]/(double)h);
        }
        return hours;
    }
}
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int l=1;
        int r=max;
        int ans=0;
        while(l<=r){
            int mid=(l+r)/2;
            int taken=hours.totalhours(piles,mid);
            if(taken<=h){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}