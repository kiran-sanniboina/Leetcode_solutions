class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=1;i<s.length();i++){
            int d1 = s.charAt(i)-'0';
            int d2 = s.charAt(i-1)-'0';
            if(Math.abs(d1-d2)>2){
                return false;
            }
        }
        return true;
    }
}