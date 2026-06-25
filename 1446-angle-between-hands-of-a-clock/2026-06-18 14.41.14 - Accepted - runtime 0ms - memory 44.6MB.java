class Solution {
    public double angleClock(int hour, int minutes) {
        hour%=12;
        double h = (hour*30)+(minutes*0.5);
        double m = minutes*6;
        double angle = Math.abs(h-m);
        return Math.min(angle,360-angle);
    }
}