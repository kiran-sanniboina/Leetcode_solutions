class Solution {
    public long subArrayRanges(int[] nums) {
        return sum_max(nums)-sum_min(nums);
    }
    static long sum_min(int[] nums){
        int[] nse = new int[nums.length];
        Stack<Integer> st1 = new Stack<>();
        for(int i=nse.length-1;i>=0;i--){
            while(!st1.isEmpty() && nums[st1.peek()]>nums[i]){
                st1.pop();
            }
            nse[i]=st1.isEmpty()?nse.length:st1.peek();
            st1.push(i);
        }
        int[] pse = new int[nums.length];
        Stack<Integer> st2 = new Stack<>();
        for(int i=0;i<pse.length;i++){
            while(!st2.isEmpty() && nums[st2.peek()]>=nums[i]){
                st2.pop();
            }
            pse[i]=st2.isEmpty()?-1:st2.peek();
            st2.push(i);
        }
        long total=0;
        for(int i=0;i<nums.length;i++){
            long l=i-pse[i];
            long r=nse[i]-i;
            total = total + (l*r*nums[i]);
        }
        return total;
    }
    static long sum_max(int[] nums){
        int[] nge = new int[nums.length];
        Stack<Integer> st1 = new Stack<>();
        for(int i=nge.length-1;i>=0;i--){
            while(!st1.isEmpty() && nums[st1.peek()]<nums[i]){
                st1.pop();
            }
            nge[i]=st1.isEmpty()?nge.length:st1.peek();
            st1.push(i);
        }
        int[] pge = new int[nums.length];
        Stack<Integer> st2 = new Stack<>();
        for(int i=0;i<pge.length;i++){
            while(!st2.isEmpty() && nums[st2.peek()]<=nums[i]){
                st2.pop();
            }
            pge[i]=st2.isEmpty()?-1:st2.peek();
            st2.push(i);
        }
        long total=0;
        for(int i=0;i<nums.length;i++){
            long l=i-pge[i];
            long r=nge[i]-i;
            total = total + (l*r*nums[i]);
        }
        return total;
    }
}