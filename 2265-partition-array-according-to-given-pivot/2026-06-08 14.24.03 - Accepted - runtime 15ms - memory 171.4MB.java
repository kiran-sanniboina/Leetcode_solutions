class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       ArrayList<Integer> list1 = new ArrayList<>();
       ArrayList<Integer> list2 = new ArrayList<>();
       int count=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]<pivot){
            list1.add(nums[i]);
        }else if(nums[i]==pivot){
            count++;
        }else{
            list2.add(nums[i]);
        }
       }
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=0;i<list1.size();i++){
        list.add(list1.get(i));
       }
       for(int i=0;i<count;i++){
        list.add(pivot);
       }
       for(int i=0;i<list2.size();i++){
        list.add(list2.get(i));
       }
       for(int i=0;i<nums.length;i++){
        nums[i]=list.get(i);
       }
       return nums;
    }
}