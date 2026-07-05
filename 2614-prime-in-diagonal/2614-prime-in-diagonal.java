class Solution {
    public boolean prime(int n){
        if(n <= 1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length; 
        int maxi = 0;
        int row =0,col =n-1;
        while(row <m && col>=0){
            if(prime(nums[row][col]) == true){
                maxi = Math.max(maxi,nums[row][col]);
            }
            row++;
            col--;
        }
        row =0;
        col =0;
        while(row <m && col<n){
            if(prime(nums[row][col]) == true){
                maxi = Math.max(maxi,nums[row][col]);
            }
            row++;
            col++;
        }
        
        return maxi;
    }
}