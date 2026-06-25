class Solution {
    public int minFlips(String s) {
        int mis0=0;
        int output=s.length();
        String t = s+s;
        for(int i=0;i<2*s.length();i++){
            char expected=(i%2==0)?'0':'1';
            if(t.charAt(i)!=expected){
                mis0++;
            }
            if(i>=s.length()){
                int left=i-s.length();
                char exp=(left%2==0)?'0':'1';
                if(t.charAt(left)!=exp){
                    mis0--;
                }
            }
            if(i>=s.length()-1){
                int mis1=s.length()-mis0;
                output=Math.min(output,Math.min(mis0,mis1));
            }
        }
        return output;
    }
}