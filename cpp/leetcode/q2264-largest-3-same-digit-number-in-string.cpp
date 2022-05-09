#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string largestGoodInteger(string num) {
        int n = num.size();
        char result = 0;

        for (int i = 0; i < n - 2; i++) {
            if (num[i] == num[i + 1] && num[i + 1] == num[i + 2]) {
                result = max(result, num[i]);
            }
        }

        return result == 0 ? "" : string(3, result);
    }
};