#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int romanToInt(string s) {
        unordered_map<char, int> m = {{'I', 1}, {'V', 5}, {'X', 10}, {'L', 50}, {'C', 100}, {'D', 500}, {'M', 1000}};

        int sum = 0;
        int length = s.size();
        for (int i = 0; i < length - 1; i++) {
            int v1 = m[s[i]];
            int v2 = m[s[i + 1]];

            if (v1 < v2) {
                sum -= v1;
            } else {
                sum += v1;
            }
        }

        sum += m[s[length - 1]];

        return sum;
    }
};