class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for(int d:digits){
            freq[d]++;
        }
        int result = 0;
        for(int i=1;i<=9;i++){
            for(int j=0;j<=9;j++){
                for(int k=0;k<=9;k++){
                    if(k%2!=0){
                        continue;
                    }
                    if(i==j && j==k){
                        if(freq[i]>=3){
                            result++;
                        }
                    }else if(i==j){
                        if(freq[i]>=2 && freq[k]>=1){
                            result++;
                        }
                    }else if(i==k){
                        if(freq[i]>=2 && freq[j]>=1){
                            result++;
                        }
                    }else if(j==k){
                        if(freq[j]>=2 && freq[i]>=1){
                            result++;
                        }
                    }else{
                        if(freq[i]>=1 && freq[j]>=1 && freq[k]>=1){
                            result++;
                        }
                    }
                }
            }
        }
        return result;
    }
}