class Solution {
public:
    int finalPositionOfSnake(int n, vector<string>& commands) {
        int ans =0;
        for(string command: commands){
            if(command == "RIGHT") ans +=1;
            else if(command == "DOWN") ans +=n;
            else if(command == "UP") ans -=n;
            else if(command == "LEFT") ans -=1;
        }
        return ans;
    }
};