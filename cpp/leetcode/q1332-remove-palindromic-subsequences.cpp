#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int removePalindromeSub(string s) {
        bool isPalindrome = true;

        int i = 0;
        int j = s.size() - 1;

        while (i < j) {
            if (s[i] != s[j]) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        return isPalindrome ? 1 : 2;
    }
};