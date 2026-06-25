class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        for(char ch='a';ch<='z';ch++){
            if(word.contains(String.valueOf(ch)) && word.contains(String.valueOf(Character.toUpperCase(ch)))){
                count++;
            }
        }
        return count;
    }
}