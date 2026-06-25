class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<words.length;i++){
            int weight_sum=0;
            for(int j=0;j<words[i].length();j++){
                weight_sum+=weights[words[i].charAt(j)-'a'];
            }
            weight_sum%=26;
            result.append((char)(122-weight_sum));
        }
        return result.toString();
    }
}