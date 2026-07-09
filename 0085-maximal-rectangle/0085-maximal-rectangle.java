class Solution {
    public int maximalRectangle(char[][] matrix) {
        int max =0;
        int n = matrix.length;
        int m = matrix[0].length;
        int[] heights = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    heights[j]++;
                }else{
                    heights[j]=0;
                }
            }
            int area = largestRectangleArea(heights);
            max = Math.max(area,max);
        }
        return max;
    }
    static int largestRectangleArea(int[] heights) {
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