class Solution {
    public String smallestPalindrome(String s) {
        int[] hash = new int[256];
        StringBuilder left = new StringBuilder();
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)]++;
        }
        String middle = "";
        for(int i=0;i<hash.length;i++){
            if(hash[i]%2==1){
                middle+=String.valueOf((char)i);
            }
            int j = 0;
            while(j<hash[i]/2){
                left.append((char)(i));
                j++;
            }
        }
        StringBuilder right = new StringBuilder(left).reverse();
        return left.toString()+middle+right.toString();
    }
}