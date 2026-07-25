class Solution {
    public int maxProduct(int n) {
        int max = -1;
        int max1 = -1;
        while(n!=0){
            int digit = n%10;
            if(digit>=max){
                max1=max;
                max=digit;
            }else{
                if(digit>max1 && digit!=max){
                    max1=digit;
                }
            }
            n/=10;
        }
        return max*max1;
    }
}