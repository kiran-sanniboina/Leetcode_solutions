class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,Set<Integer>> map = new HashMap<>();
        for(int[] res:reservedSeats){
            int row = res[0];
            int seat = res[1];
            if(seat>=2 && seat<=9){
                map.computeIfAbsent(row,key->new HashSet<>()).add(seat);
            }
        }
        int total = 2*(n-map.size());
        for(Set<Integer> set:map.values()){
            boolean leftfree = !set.contains(2) && !set.contains(3) && !set.contains(4) && !set.contains(5);
            boolean rightfree = !set.contains(6) && !set.contains(7) && !set.contains(8) && !set.contains(9);
            boolean middlefree = !set.contains(4) && !set.contains(5) && !set.contains(6) && !set.contains(7);
            if(leftfree && rightfree){
                total+=2;
            }else if(leftfree || rightfree || middlefree){
                total+=1;
            }
        }
        return total;
    }
}