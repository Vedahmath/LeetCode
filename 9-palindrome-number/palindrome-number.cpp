class Solution {
public:
    bool isPalindrome(int x) {
        string str = to_string(x);
        int size = str.size();

        int i = 0;
        int j = size - 1;

        while(j>i){
            if(str[i] != str[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
};