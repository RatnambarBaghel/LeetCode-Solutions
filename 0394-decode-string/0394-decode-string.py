class Solution:
    def decodeString(self, s: str) -> str:
        num =0
        counts = []
        result = []
        curr = ""
        for ch in s:
            if ch.isdigit():
                num = num * 10+int(ch)
            elif ch == '[':
                counts.append(num)
                result.append(curr)
                num =0
                curr = ""
            elif ch ==']':
                repeat = counts[-1]
                counts.pop()
                temp = result[-1]
                result.pop()
                while(repeat !=0):
                    temp += curr
                    repeat -=1

                curr = temp
            else:
                curr += ch

        return curr