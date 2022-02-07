class Solution {
public:
    vector<int> addToArrayForm(vector<int>& num, int k) {
        int carry = k;
        int i = 0;
        reverse(num.begin(),num.end());
        num[i] += carry;
        carry = num[i]/10;
        num[i] %= 10;
        while (carry){
            i++;
            if(i < num.size()){
                num[i] += carry;
            } else{
                num.emplace_back(carry);
            }
            carry = num[i]/10;
            num[i] %= 10;
        }
        reverse(num.begin(), num.end());
        return num;
    }
};
