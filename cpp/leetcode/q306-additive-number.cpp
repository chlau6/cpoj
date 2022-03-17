#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isAdditiveNumber(string num) {
        int n = num.size();

        for (int i = 1; i <= n / 2; i++) {
            if (num[0] == '0' && i > 1) break;

            long x = stol(num.substr(0, i));
            for (int j = i + 1; j < n; j++) {
                if (num[i] == '0' && j > i + 1) break;

                long y = stol(num.substr(i, j - i));

                if (isValid(x, y, num.substr(j))) {
                    return true;
                }
            }
        }

        return false;
    }

    bool isValid(long x, long y, string num) {
        if (num.empty()) return true;

        long b = x + y;
        long a = y;

        string sum = to_string(b);
        int n = sum.size();

        return num.find(sum) == 0 && isValid(a, b, num.substr(n));
    }
};