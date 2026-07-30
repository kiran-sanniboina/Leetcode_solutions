class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if(n<=8){
            return n;
        }
        int touches = 0;
        if(n<=16){
            touches=8+(n-8)*2;
        }else if(n<=24){
            touches=24+(n-16)*3;
        }else if(n<=26){
            touches=48+(n-24)*4;
        }
        return touches;
    }
}