class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            boolean valid=true;
            boolean changed=false;
            int num=i;
            while(num>0 && valid){
                int digit=num%10;
                if(digit==3 || digit==4 || digit==7){
                    valid=false;
                }
                else if(digit==2 || digit==5 || digit==6 || digit==9){
                    changed=true;
                }
                num=num/10;
            }
            if(valid && changed){
                count++;
            }
        }
        return count;
    }
}