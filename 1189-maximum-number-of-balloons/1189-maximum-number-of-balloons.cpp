class Solution {
public:
    int maxNumberOfBalloons(string text) {
        unordered_map<char,int> map;
        int n = text.size();
        for(char &ch : text){
            if(ch =='b' || ch =='a' || ch =='l' || ch == 'o' || ch == 'n'){
                map[ch]++;
            }
        }
        
        return min(min(min(map['b'],map['a']),min(map['n'],map['l']/2)),map['o']/2);
    }
};