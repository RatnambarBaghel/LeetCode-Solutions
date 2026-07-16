class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        int n = s1.size();
        int m = s2.size();

        vector<int> f1(26, 0);
        vector<int> f2(26, 0);

        for(int i=0;i<n;i++){
            f1[s1[i] -'a']++;
        }

        int i =0,j=0;
        while(j < m){
            f2[s2[j] - 'a']++;
            if(j-i+1 > n){
                f2[s2[i] -'a']--;
                i++;
            }
            if(f1 == f2){
                return true;
            }
            j++;
        }
        return false;
    }
};