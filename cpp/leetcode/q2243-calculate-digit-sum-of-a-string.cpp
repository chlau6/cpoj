#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string digitSum(string s, int k) {
        while (s.size() > k) {
            string temp = "";

            for (int i = 0; i < s.size(); i += k) {
                int n = min(k, (int) s.size() - i + 1);
                string substr = s.substr(i, n);
                int sum = 0;

                for (int j = 0; j < substr.size(); j++) {
                    sum += substr[j] - '0';
                }

                temp += to_string(sum);
            }

            s = temp;
        }

        return s;
    }
};