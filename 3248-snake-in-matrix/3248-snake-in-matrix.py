class Solution:
    def finalPositionOfSnake(self, n: int, commands: List[str]) -> int:
        ans =0
        for command in commands:
            if(command == "RIGHT"):
                ans +=1
            elif(command == "DOWN"):
                 ans +=n
            elif(command == "UP"):
                 ans -=n
            elif(command == "LEFT"):
                 ans -=1
        
        return ans