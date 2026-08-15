class Solution {
public:
    string intToRoman(int num) {
        static vector<int> value{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        static vector<string> symbol{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        string ans ="";
        for(int i=0;i<13;i++){
            if(num == 0) break;

            int cnt = num / value[i];
            while(cnt >0){
                ans += symbol[i];
                cnt--;
            }

            num = num % value[i];
        }
        return ans;
    }
};