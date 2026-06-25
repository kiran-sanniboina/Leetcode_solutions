class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            int landtime=0;
            int landfinish=landStartTime[i]+landDuration[i];
            for(int j=0;j<waterStartTime.length;j++){
                landtime=Math.max(landfinish,waterStartTime[j])+waterDuration[j];
                min=Math.min(landtime,min);
            }
        }
        for(int i=0;i<waterStartTime.length;i++){
            int watertime=0;
            int waterfinish=waterStartTime[i]+waterDuration[i];
            for(int j=0;j<landStartTime.length;j++){
                watertime=Math.max(waterfinish,landStartTime[j])+landDuration[j];
                min=Math.min(watertime,min);
            }
        }
        return min;
    }
}