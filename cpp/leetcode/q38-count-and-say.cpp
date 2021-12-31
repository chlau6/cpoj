#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string countAndSay(int n) {
        string result = "1";

        for (int i = 2; i <= n; i++) {
            string str;

            char c = result[0];
            int k = result.size();
            int count = 1;

            for (int j = 1; j < k; j++) {
                if (result[j] != result[j - 1]) {
                    str = str + to_string(count) + c;
                    c = result[j];
                    count = 1;
                } else {
                    count++;
                }
            }

            result = str + to_string(count) + c;
        }

        return result;
    }
};