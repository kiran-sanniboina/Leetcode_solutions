class Solution {
    public int minOperations(String s) {
        int n = s.length();
        if(isSorted(s)){
            return 0;
        }
        if(n==2){
            return -1;
        }
        char min = 'z';
        char max = 'a';
        for(int i=0;i<n;i++){
            if(min>s.charAt(i)){
                min = s.charAt(i);
            }
            if(max<s.charAt(i)){
                max = s.charAt(i);
            }
        }

        if(s.charAt(0)==min || s.charAt(n-1)==max){
            return 1;
        }
        boolean condition = false;
        if(s.charAt(0)==max && s.charAt(n-1)==min){
            for(int i=1;i<n-1;i++){
                char ch = s.charAt(i);
                if(ch==min || ch==max){
                    condition = true;
                    break;
                }
            }
            if(!condition){
                return 3;
            }
        }
        return 2;
    }
    private boolean isSorted(String s){
        int n = s.length();
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)>s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}