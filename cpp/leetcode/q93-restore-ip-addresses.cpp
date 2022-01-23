#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> restoreIpAddresses(string s) {
        vector<string> result;

        int n = s.size();

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                for (int k = 1; k < 4; k++) {
                    for (int l = 1; l < 4; l++) {
                        if (i + j + k + l != n) continue;

                        int a = stoi(s.substr(0, i));
                        int b = stoi(s.substr(i, j));
                        int c = stoi(s.substr(i + j, k));
                        int d = stoi(s.substr(i + j + k, l));

                        if (a > 255 || b > 255 || c > 255 || d > 255) continue;

                        string str = to_string(a) + "." + to_string(b) + "." + to_string(c) + "." + to_string(d);

                        if (str.size() == n + 3) {
                            result.push_back(str);
                        }
                    }
                }
            }
        }

        return result;
    }
};