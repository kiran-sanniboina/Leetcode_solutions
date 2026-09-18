class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first,-1);
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i)-'a';
            if(first[ch]==-1){
                first[ch]=i;
            }
            last[ch]=i;
        }
        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i)-'a';
            if(first[ch]!=i){
                continue;
            }
            int end = last[ch];
            int j = i;
            boolean valid = true;
            while(j<=end){
                int c = s.charAt(j)-'a';
                if(first[c]<i){
                    valid=false;
                    break;
                }
                end=Math.max(end,last[c]);
                j++;
            }
            if(valid) list.add(new int[] {i,end});
        }
        list.sort((a,b)->{
            if(a[0]!=b[0]) return a[0]-b[0];
            return (a[1]-a[0]-b[1]-b[0]);
        });
        List<String> result = new ArrayList<>();
        int prevend = -1;
        for(int i=0;i<list.size();i++){
            int[] cur = list.get(i);
            if(cur[0]<=prevend){
                continue;
            }
            if(i+1<list.size() && list.get(i+1)[0]<=cur[1]){
                continue;
            }
            result.add(s.substring(cur[0],cur[1]+1));
            prevend=cur[1];
        }
        return result;
    }
}