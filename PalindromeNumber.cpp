class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0) return false; //negative numbers not palindrome
        if (x != 0 and x%10 == 0) return false; //numbers like 10, 20 etc cannot be palindromes
        int reverse = 0;
        while (x > reverse){
            /*  Ex: Lets say x = 1221
                reverse = 0
                Step 1: 10*0 + 1221%10 = 1
                x = 122
                Step 2: 10*1 + 122%10 = 12
                x = 12
                Step 3: x = reverse
            */
    
            reverse = 10*reverse + x%10;
            x = x/10;
        }
        if(x == reverse){ // Only valid for even length palindromes
            return true;
        }
        if(x == reverse/10){ //Only valid for odd length palindromes
            
            /*  Ex: Lets say x = 232
                reverse = 0
                Step 1: 10*0 + 232%10 = 2
                x = 23
                Step 2: 10*2 + 23%10 = 23
                x = 2
                Step 3: x = reverse/10
            */
            
            return true;
        }
        return false;
    }
};
