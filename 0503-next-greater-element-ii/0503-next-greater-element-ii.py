class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        n = len(nums)
        st =[]
        next =[-1]*n
        for i in range(n-1,-1,-1):
            while(st and st[-1] <= nums[i]):
                st.pop()
            if not st:
                next[i] = -1
            else:
                next[i] = st[-1]

            st.append(nums[i])

        for i in range(n-1,-1,-1):
            while(st and st[-1] <= nums[i]):
                st.pop()
            if not st:
                next[i] = -1
            else:
                next[i] = st[-1]
            st.append(nums[i])
        
        return next