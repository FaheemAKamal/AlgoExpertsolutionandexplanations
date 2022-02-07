class Solution {
public:
    string addBinary(string a, string b) {
        int carry = 0; //Can user short instead of int for less m
        int sum = 0;
        string answer = "";
        
        //Deal with varying lengths, add leading zeros
        if(a.size() > b.size()){
            b = string(a.size()-b.size(),'0') + b;
        }else{
            a = string(b.size()-a.size(),'0') + a;
        }
        
        //iterate in reverise
        for (int i = a.size() - 1; i >= 0; i--){
            sum = (a[i] - '0') + (b[i] - '0') + carry; //((int)a[i]) - ((int)'0')
            
            //Next if,else statements are properties of binary addition
            if (sum == 3){
                answer = '1' + answer; //String concatentation of 1 + answer
                carry = 1; // Carry value that goes over
            }else if (sum == 2){
                answer = '0' + answer;
                carry = 1;
            }else if (sum == 1){
                answer = '1' + answer;
                carry = 0;
            }else {
                answer = '0' + answer;
                carry = 0;
            }
        
        }
        
        //This determines what we return
        if (carry == 0) {
            return answer;
        }
        else {
            return '1' + answer;
        }
    }
};
