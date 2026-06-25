class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n=boxGrid.length-1;
        int m=boxGrid[0].length-1;
        char[][] outputGrid=new char[m+1][n+1];
        for(int i=0;i<=n;i++){
            int empty=m;
            for(int j=m;j>=0;j--){
                if(boxGrid[i][j]=='*'){
                    empty=j-1;
                }
                else if(boxGrid[i][j]=='#'){
                    boxGrid[i][j]='.';
                    boxGrid[i][empty]='#';
                    empty--;
                }
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                outputGrid[j][i]=boxGrid[i][j];
            }
        }
        for(int i=0;i<outputGrid.length;i++){
            for(int j=0;j<outputGrid[0].length/2;j++){
                char temp= outputGrid[i][j];
                outputGrid[i][j]=outputGrid[i][outputGrid[0].length-1-j];
                outputGrid[i][outputGrid[0].length-1-j]=temp;
            }
        }
        return outputGrid;
    }
}