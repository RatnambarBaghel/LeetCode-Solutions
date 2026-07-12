class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] sortedArr = new int[n];
        for(int i=0;i<n;i++){
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr);
        int rank =1;
        for(int i=0;i<n;i++){
            if(i > 0 && sortedArr[i] > sortedArr[i-1]) rank++;
            map.put(sortedArr[i],rank);
        }
        int[]  ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}