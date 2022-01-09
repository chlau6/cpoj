#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string simplifyPath(string path) {
        string result, token;
        stringstream ss(path);
        vector<string> v;

        while (getline(ss, token, '/')) {
            if (token == "..") {
                if (!v.empty()) {
                    v.pop_back();
                }
            } else if (!token.empty() && token != ".") {
                v.push_back(token);
            }
        }

        for (string s : v) {
            result += "/" + s;
        }

        return result.empty() ? "/" : result;
    }
};