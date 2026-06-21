class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] result= new long[n];
        HashMap<Integer, List<Integer>> mpp = new HashMap<>();
        for(int i = 0;i < n; i++){
            mpp.computeIfAbsent(nums[i],k -> new ArrayList<>()).add(i);
        }
        for (Map.Entry<Integer, List<Integer>> entry : mpp.entrySet()){
            List<Integer> list = entry.getValue();
            int length = list.size();

            long[] prefix = new long[length];
            prefix[0] = list.get(0);

            for (int i = 1; i < length; i++) {
                prefix[i] = prefix[i - 1] + list.get(i);
            }

            if (length == 1) {
                result[list.get(0)] = 0;
            } 
            else {
                for (int i = 0; i < length; i++) {
                        int index = list.get(i);
                        long val = list.get(i);

                        long left = (long)i * val - (i > 0 ? prefix[i - 1] : 0);
                        long right = (prefix[length - 1] - prefix[i]) - (long)(length - i - 1) * val;

                        result[index] = left + right;
                    }
                }
                
            }
            return result;
    
       
    }
}