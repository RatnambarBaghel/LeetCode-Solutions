class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left =0,right = n-1;
        int top =0,bottom = n-1;
        int flag =1;
        while(left <= right && top <= bottom){
            for(int i =left;i<=right;i++){
                matrix[top][i] = flag;
                flag++;
            }
            top++;

            for(int i=top;i<= bottom;i++){
                matrix[i][right] = flag;
                flag++;
            }
            right--;
            for(int i=right;i>=left;i--){
                matrix[bottom][i] = flag;
                flag++;
            }
            bottom--;
            for(int i =bottom;i>=top;i--){
                matrix[i][left] = flag;
                flag++;
            }
            left++;
        }
        return matrix;
    }
}