class Solution {
    public int maximumLengthSubstring(String s) {
        if(s.length()==2){
            return 2;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int maxlen = 0;
        int l = 0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.get(s.charAt(i))>2){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            maxlen = Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}