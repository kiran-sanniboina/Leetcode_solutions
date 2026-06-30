class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }else if(asteroids[i]<0){
                while(!st.isEmpty() && Math.abs(asteroids[i])>st.peek() && st.peek()>0){
                    st.pop();
                }
                if(st.isEmpty() || st.peek()<0){
                    st.push(asteroids[i]);
                }else if(st.peek()== -asteroids[i]){
                    st.pop();
                }else{
                    continue;
                }
            }
        }
        int[] arr = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
    }
}