class Solution {
    public int matrixSum(int[][] nums) {
        int m = nums.length;
        int n= nums[0].length;
        int maxi = Integer.MIN_VALUE;
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int l=m,k=n;
        while(l>0 || k>0){
            for(int i=0;i<m;i++){
                maxi = Integer.MIN_VALUE;
                for(int j=0;j<n;j++){
                    if(nums[i][j] >= maxi){
                        map.put(nums[i][j],j);
                    }
                    maxi = Math.max(maxi,nums[i][j]);    
                }
                nums[i][map.get(maxi)] = 0;
            }       
            int comp = Integer.MIN_VALUE;
            for(int key : map.keySet()){
                comp = Math.max(comp,key);
            }
            sum += comp;
            map.clear();
            l-- ;
            k--;
        }
        return sum;
    }
}