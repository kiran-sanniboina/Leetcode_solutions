class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] out = new int[n+1][2];
        int i = 0;
        int j = 0;
        while(i<n && intervals[i][1]<newInterval[0]){
            out[j++]=intervals[i++];
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        out[j++]=newInterval;
        while(i<n){
            out[j++]=intervals[i++];
        }
        return Arrays.copyOf(out,j);
    }
}