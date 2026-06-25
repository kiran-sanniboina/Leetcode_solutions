class Solution {
    public boolean checkOnesSegment(String s) {
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='1' && s.charAt(i+1)=='1'){
                count++;
            }
        }
        if(count>0){
            return true;
        }
        return false;
    }
}