class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                result.deleteCharAt(result.length()-1);
            }else if(s.charAt(i)=='#'){
                result.append(result);
            }else if(s.charAt(i)=='%'){
                result=result.reverse();
            }else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}