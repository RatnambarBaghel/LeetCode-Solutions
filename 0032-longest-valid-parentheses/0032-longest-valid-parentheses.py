class Solution:
    def longestValidParentheses(self, s: str) -> int:
        ans = 0
        st =[]
        st.append(-1)
        for i in range(len(s)):
            ch = s[i]
            if( ch =='('):
                st.append(i)
            else:
                st.pop()
                if(not st):
                    st.append(i)
                else:
                    currSum = i - st[-1]
                    ans = max(ans,currSum)

        return ans