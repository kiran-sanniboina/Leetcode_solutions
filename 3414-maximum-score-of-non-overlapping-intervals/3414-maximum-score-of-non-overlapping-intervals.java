class Solution {
    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();
        Integer[] idx = new Integer[n];
        for(int i=0;i<n;i++){
            idx[i]=i;
        }
        Arrays.sort(idx,(a,b)->intervals.get(a).get(1)-intervals.get(b).get(1));
        long[] sorted = new long[n];
        for(int i=0;i<n;i++){
            sorted[i]=intervals.get(idx[i]).get(1);
        }
        long[][] dpscore = new long[5][n+1];
        List<Integer>[][] dplist = new List[5][n+1];
        for(int c=0;c<=4;c++){
            dplist[c][0] = new ArrayList<>();
            dpscore[c][0] = 0;
        }
        for(int j=1;j<=n;j++){
            int org = idx[j-1];
            long l = intervals.get(org).get(0);
            long w = intervals.get(org).get(2);
            int pos = binarysearch(sorted,j-1,l);
            for(int c=0;c<=4;c++){
                long bestscore=dpscore[c][j-1];
                List<Integer> bestlist=dplist[c][j-1];
                if(c>=1){
                    long takescore=dpscore[c-1][pos]+w;
                    List<Integer> takelist = new ArrayList<>(dplist[c-1][pos]);
                    takelist.add(org);
                    Collections.sort(takelist);
                    if(takescore>bestscore || (takescore==bestscore && islexsmaller(takelist,bestlist))){
                        bestscore=takescore;
                        bestlist=takelist;
                    }
                }
                dpscore[c][j]=bestscore;
                dplist[c][j]=bestlist;
            }
        }
        List<Integer> answer = dplist[4][n];
        Collections.sort(answer);
        int[] result = new int[answer.size()];
        for(int i=0;i<result.length;i++){
            result[i]=answer.get(i);
        }
        return result;
    }
    private int binarysearch(long[] arr,int limit, long l){
        int low = 0;
        int high = limit;
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]<l){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
    private boolean islexsmaller(List<Integer> a, List<Integer> b){
        int len = Math.min(a.size(),b.size());
        for(int i=0;i<len;i++){
            if(!a.get(i).equals(b.get(i))){
                return a.get(i)<b.get(i);
            }
        }
        return a.size()<b.size();
    }
}