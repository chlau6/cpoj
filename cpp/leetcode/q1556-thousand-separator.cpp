#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string thousandSeparator(int n) {
        if (n == 0) return "0";

        int i = 0;
        string result;

        while (n > 0) {
            if (i > 0 && i % 3 == 0) {
                result.push_back('.');
            }

            result.push_back(n % 10 + '0');
            n /= 10;
            i++;
        }

        reverse(result.begin(), result.end());

        return result;
    }
};