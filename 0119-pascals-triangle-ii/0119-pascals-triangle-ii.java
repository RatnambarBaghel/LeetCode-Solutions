class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ansRow = new ArrayList<>();
        long ans = 1;
        ansRow.add((int)ans);
        for(int i=0;i<rowIndex;i++){
            ans = ans * (rowIndex - i);
            ans = ans / (i+1);
            ansRow.add((int)ans);
        }
        return ansRow;
    }
}