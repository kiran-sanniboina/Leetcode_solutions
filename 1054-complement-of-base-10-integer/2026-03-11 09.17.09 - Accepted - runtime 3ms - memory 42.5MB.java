class Solution {
    public int bitwiseComplement(int n) {
        String binary=Integer.toBinaryString(n);
        String output_binary="";
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='0'){
                output_binary+='1';
            }
            else{
                output_binary+='0';
            }
        } 
        return Integer.parseInt(output_binary,2);
    }
}