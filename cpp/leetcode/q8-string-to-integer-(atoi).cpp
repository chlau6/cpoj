#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int myAtoi(string s) {
        int n = s.size();
        int i = 0;
        int sign = 1;
        int bound = INT_MAX / 10;
        int result = 0;

        while (i < n && s[i] == ' ') i++;

        if (i < n && (s[i] == '+' || s[i] == '-')) {
            sign = (s[i++] == '-') ? -1 : 1;
        }

        while (i < n && isdigit(s[i])) {
            if (result > bound || (result == bound && s[i] > '7')) {
                if (sign == 1) return INT_MAX;
                else return INT_MIN;
            }

            result = result * 10 + (s[i++] - '0');
        }

        return result * sign;
    }
};