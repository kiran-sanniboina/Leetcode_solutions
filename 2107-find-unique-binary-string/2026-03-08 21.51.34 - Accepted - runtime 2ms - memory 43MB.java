class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String output = "";
        for(int i=0;i<nums.length;i++){
            if(nums[i].charAt(i)=='0'){
                output+='1';
            }
            else{
                output+='0';
            }
        }
        return output;
    }
}