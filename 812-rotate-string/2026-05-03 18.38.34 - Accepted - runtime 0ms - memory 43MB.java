class Solution {
    public boolean rotateString(String s, String goal) {
        String str = s+s;
        int i=0;
        while((i+s.length())!=str.length()){
            if(str.substring(i,i+s.length()).equals(goal)){
                return true;
            }
            i++;
        }
        return false;
    }
}