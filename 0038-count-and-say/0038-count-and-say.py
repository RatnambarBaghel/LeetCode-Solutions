class Solution:
    def countAndSay(self, n: int) -> str:
        if n == 1:
            return "1"

        say = self.countAndSay(n-1)
        ans = []
        length = len(say)

        i = 0
        while i < length:
            ch = say[i]
            cnt = 1
            while i < length-1 and say[i] == say[i+1]:
                cnt += 1
                i += 1
            ans.append(str(cnt))
            ans.append(ch)
            i += 1

        return "".join(ans)