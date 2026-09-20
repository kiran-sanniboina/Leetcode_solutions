class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int[] arr = new int[26];
        int val = 26;
        for(int i=0;i<26;i++){
            arr[i]=val--;
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            int ch = s.charAt(i)-'a';
            sum+=(arr[ch]*(i+1));
        }
        return sum;
    }
}