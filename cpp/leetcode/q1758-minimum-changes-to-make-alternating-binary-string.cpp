#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minOperations(string s) {
        int n = s.size();
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (s[i] - '0' == i % 2) {
                result++;
            }
        }

        return min(result, n - result);
    }
};