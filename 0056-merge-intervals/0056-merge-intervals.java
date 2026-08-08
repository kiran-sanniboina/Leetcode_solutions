class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> out = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int[] part:intervals){
            if(part[0]<=end){
                end=Math.max(end,part[1]);
            }else{
                out.add(new int[] {start,end});
                start = part[0];
                end = part[1];
            }
        }
        out.add(new int[] {start,end});
        return out.toArray(new int[0][]);
    }
}