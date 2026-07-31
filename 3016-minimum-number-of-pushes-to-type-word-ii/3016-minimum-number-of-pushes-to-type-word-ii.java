class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<word.length();i++){
            map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        int pushes = 0;
        for(int i=0;i<list.size();i++){
            pushes+=list.get(i)*(i/8 + 1);
        }
        return pushes;
    }
}