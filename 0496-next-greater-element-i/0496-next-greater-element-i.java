class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int next[] = new int[n];
        int ans[] = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        for(int i =n-1;i>=0;i--){
            while(st.isEmpty() == false && st.peek() <= nums2[i]) st.pop();
            if(st.isEmpty() == true) next[i] = -1;
            else next[i] = st.peek();
            st.push(nums2[i]);
        }
        for(int i =0;i<nums1.length;i++){
            for(int j =0;j<n;j++){
                if(nums1[i] == nums2[j]){
                    ans[i] = next[j];
                }
            }
        }
        return ans;
    }
}