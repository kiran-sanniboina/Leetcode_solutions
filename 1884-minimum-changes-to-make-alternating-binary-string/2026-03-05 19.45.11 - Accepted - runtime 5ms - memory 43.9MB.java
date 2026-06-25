class Solution {
    public int minOperations(String s) {
        int output0=0;
        int output1=0;
        for(int i=0;i<=s.length()-1;i++){
            if(i%2==0){
                if(s.charAt(i)=='0'){
                    output1++;
                }
                else{
                    output0++;
                }
            }
            else{
                if(s.charAt(i)=='1'){
                    output1++;
                }
                else{
                    output0++;
                }
            }
        }
        return Math.min(output0,output1);
    }
}