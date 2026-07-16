class Solution {
    public long gcdSum(int[] nums) {
        int mx = 0;
        int n = nums.length;
        int[] prfx = new int[n];
        for(int i=0;i<n;i++){
            mx=Math.max(nums[i],mx);
            prfx[i]=gcd(nums[i],mx);
        }
        Arrays.sort(prfx);
        long result = 0;
        int i = 0;
        while(i<n/2){
            result += gcd(prfx[i],prfx[n-i-1]);
            i++;
        }
        return result;
    }
    static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return Math.abs(a);
    }
}