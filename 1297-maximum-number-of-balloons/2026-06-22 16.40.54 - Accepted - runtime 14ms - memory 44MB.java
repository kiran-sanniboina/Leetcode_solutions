class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<text.length();i++){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        }
        int[] balloons = {map.getOrDefault('b',0),map.getOrDefault('a',0),map.getOrDefault('l',0)/2,map.getOrDefault('o',0)/2,map.getOrDefault('n',0)};
        int count = Integer.MAX_VALUE;
        for(int balloon:balloons){
            count=Math.min(count,balloon);
        }        
        return count;
    }
}