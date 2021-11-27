#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool areNumbersAscending(string s) {
        int n = s.size();

        int prev = 0;
        int curr = 0;

        for (char c : s) {
            if (isdigit(c)) {
                curr = curr * 10 + c - '0';
            } else if (curr > 0) {
                if (curr <= prev) return false;
                prev = curr;
                curr = 0;
            }
        }

        return curr == 0 || curr > prev;
    }
};