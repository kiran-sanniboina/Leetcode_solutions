class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> out = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>(Collections.nCopies(i+1,1));
            for(int j=1;j<i;j++){
                int val=out.get(i-1).get(j-1)+out.get(i-1).get(j);
                row.set(j,val);
            }
            out.add(row);
        }
        return out;
    }
}