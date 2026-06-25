class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] out = new int[A.length];
        int count = 0;
        for(int i=0;i<A.length;i++){
            int a = Math.abs(A[i]);
            int b = Math.abs(B[i]);
            if(a<0){
                a*=-1;
            }
            if(b<0){
                b*=-1;
            }
            A[a-1]=-Math.abs(A[a-1]);
            B[b-1]=-Math.abs(B[b-1]);
            if(A[b-1]<0 && a!=b){
                count++;
            }
            if(B[a-1]<0 && a!=b){
                count++;
            }
            if(a==b){
                count++;
            }
            out[i]=count;
        }
        return out;
    }
}