class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int expectedSum = (n *(n+1))/2;
        int[]  ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int sum =0;
        int dup = 0;
        for(int key: map.keySet()){
            sum += key;
            if(map.get(key) == 2) dup = key;
        }
        ans[0] = dup;
        ans[1] = expectedSum -sum;
        return ans;
    }
}