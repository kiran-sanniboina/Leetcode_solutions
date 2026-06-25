class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long low=1,high=10000000000000000L;
        while(low<high){
            long mid=(low+high)/2;
            long total=0;
            for(int i=0;i<workerTimes.length && total<mountainHeight;i++){
                total+=(long)(Math.sqrt((double)mid/workerTimes[i]*2+0.25)-0.5);
            }
            if(total>=mountainHeight){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}