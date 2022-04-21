#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int largestPalindrome(int n) {
        int upper = pow(10, n) - 1;
        int lower = upper / 10;

        for (int i = upper; i > lower; i--) {
            string t = to_string(i);

            long l = stol(t + string(t.rbegin(), t.rend()));

            for (long j = upper; j * j > l; j--) {
                if (l % j == 0) {
                    return l % 1337;
                }
            }
        }

        return 9;
    }
};