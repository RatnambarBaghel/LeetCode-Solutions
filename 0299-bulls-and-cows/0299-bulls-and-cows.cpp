class Solution {
public:
    string getHint(string secret, string guess) {
        int n = secret.size();
        unordered_map<char,int> map;
        string ans="";
        int cnt =0;
        for(int i=0;i<n;i++){
            if(secret[i] == guess[i]){
                cnt++;
            }
            else{
                map[secret[i]]++;
            }
        }
        ans +=to_string(cnt);
        ans += "A";
        int count =0;
        for(int i=0;i<n;i++){
            if(secret[i] == guess[i]) continue;
            if(map.find(guess[i]) != map.end()){
                map[guess[i]]--;
                count++;
                if(map[guess[i]] == 0){
                    map.erase(guess[i]);
                }
            }
        }
        ans += to_string(count);
        ans += "B";
        return ans;



    }
};