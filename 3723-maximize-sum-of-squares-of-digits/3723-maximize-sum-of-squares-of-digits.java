class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>9*num){
            return new String();
        }
        int cur;
        StringBuilder s = new StringBuilder();
        for(int i=0;i<num;i++){
            cur=Math.min(9,sum);
            s.append(cur);
            sum-=cur;
        }
        return s.toString();
    }
}