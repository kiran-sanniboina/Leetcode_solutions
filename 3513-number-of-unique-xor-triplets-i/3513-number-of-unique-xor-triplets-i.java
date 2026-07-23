import java.math.BigInteger;
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if(n<=2){
            return n;
        }
        int bitlen = Integer.SIZE-Integer.numberOfLeadingZeros(n);
        return 1<<bitlen;
    }
}