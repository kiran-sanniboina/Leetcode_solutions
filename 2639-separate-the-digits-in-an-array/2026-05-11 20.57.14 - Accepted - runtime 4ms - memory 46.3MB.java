class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            int n=nums[i];
            while(n!=0){
                int digit=n%10;
                list.add(digit);
                n=n/10;
            }
        } 
        int[] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[arr.length-i-1] = list.get(i);
        }
        return arr;
    }
}