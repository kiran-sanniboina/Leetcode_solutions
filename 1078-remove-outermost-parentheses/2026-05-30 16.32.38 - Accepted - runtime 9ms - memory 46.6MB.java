class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        String str="";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='('){
                count++;
                if(count>1){
                    str+='(';
                }
            }else{
                count--;
                if(count>0){
                    str+=')';
                }
            }
        }
        return str;
    }
}