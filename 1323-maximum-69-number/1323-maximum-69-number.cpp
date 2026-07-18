class Solution {
public:
    int maximum69Number (int num) {
        vector<int> temp;
        int ans =num;
        while(num != 0){
            int rem = num % 10;
            temp.push_back(rem);
            num /= 10;
        }
        int n = temp.size();
        for(int i =n-1;i>=0;i--){
            if(temp[i] == 6){
                temp[i] = 9;
                break;
            }
        }
        reverse(temp.begin(), temp.end());
        int curr =0;
        for(int x : temp){
            curr = curr * 10 + x;
        }
        ans = max(ans,curr);
        return ans;
    }
};