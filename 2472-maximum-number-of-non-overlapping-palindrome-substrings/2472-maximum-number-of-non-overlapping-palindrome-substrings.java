class Solution {
    public int maxPalindromes(String s, int k) {
        int count = 0;
        int n = s.length();
        int i = 0;
        while(i<=n-k){
            if(i+k-1<n && ispalindrome(i,i+k-1,s)){
                count++;
                i+=k;
            }else if(i+k<n && ispalindrome(i,i+k,s)){
                count++;
                i+=k+1;
            }else{
                i++;
            }
        }
        return count;
    }
    private boolean ispalindrome(int i, int j, String s){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}