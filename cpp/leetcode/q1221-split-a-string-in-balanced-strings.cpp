#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int balancedStringSplit(string s) {
        int result = 0;
        int balance = 0;
        int length = s.length();

        for (char c : s) {
            if (c == 'L') balance++;
            else balance--;

            if (balance == 0) result++;
        }

        return result;
    }
};