class Solution {
    public boolean checkOnesSegment(String s) {
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.contains("01")){
                return false;
            }
        }
        return true;
    }
}