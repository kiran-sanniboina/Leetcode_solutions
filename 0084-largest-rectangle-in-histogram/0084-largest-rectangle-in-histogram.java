class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] nse = new int[heights.length];
        Stack<Integer> st1 =  new Stack<>();
        for(int i=nse.length-1;i>=0;i--){
            while(!st1.isEmpty() && heights[st1.peek()]>heights[i]){
                st1.pop();
            }
            nse[i]=st1.isEmpty()?nse.length:st1.peek();
            st1.push(i);
        }
        int[] pse = new int[heights.length];
        Stack<Integer> st2 =  new Stack<>();
        for(int i=0;i<pse.length;i++){
            while(!st2.isEmpty() && heights[st2.peek()]>=heights[i]){
                st2.pop();
            }
            pse[i]=st2.isEmpty()?-1:st2.peek();
            st2.push(i);
        }
        int max = 0;
        for(int i=0;i<heights.length;i++){
            max=Math.max(max,heights[i]*(nse[i]-pse[i]-1));
        }
        return max;
    }
}