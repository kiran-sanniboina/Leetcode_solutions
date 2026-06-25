class Solution {
    public int largestAltitude(int[] gain) {
        int max_altitude=Integer.MIN_VALUE;
        int altitude = 0;
        for(int i=0;i<gain.length;i++){
            max_altitude=Math.max(max_altitude,altitude);
            altitude+=gain[i];
        }
        return max_altitude;
    }
}