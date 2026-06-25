class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long p_mass=mass;
        Arrays.sort(asteroids);
        for(int i=0;i<asteroids.length;i++){
            if(p_mass>=asteroids[i]){
                p_mass+=asteroids[i];
            }else{
                return false;
            }
        }
        return true;
    }
}