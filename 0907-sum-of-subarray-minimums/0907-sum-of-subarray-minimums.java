class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nse = new int[arr.length];
        Stack<Integer> st1 = new Stack<>();
        for(int i=nse.length-1;i>=0;i--){
            while(!st1.isEmpty() && arr[st1.peek()]>arr[i]){
                st1.pop();
            }
            nse[i]=st1.isEmpty()?nse.length:st1.peek();
            st1.push(i);
        }
        int[] pse = new int[arr.length];
        Stack<Integer> st2 = new Stack<>();
        for(int i=0;i<pse.length;i++){
            while(!st2.isEmpty() && arr[st2.peek()]>=arr[i]){
                st2.pop();
            }
            pse[i]=st2.isEmpty()?-1:st2.peek();
            st2.push(i);
        }
        long total=0;
        long mod=1000000007;
        for(int i=0;i<arr.length;i++){
            long l=i-pse[i];
            long r=nse[i]-i;
            total = (total + ((l * r) % mod * arr[i]) % mod) % mod;
        }
        return (int)total;
    }
}