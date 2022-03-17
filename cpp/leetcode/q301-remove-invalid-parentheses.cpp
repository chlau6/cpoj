#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> removeInvalidParentheses(string s) {
        vector<string> result;
        queue<string> queue;
        unordered_set<string> set;
        bool found = false;

        queue.push(s);
        set.insert(s);

        while (!queue.empty()) {
            string str = queue.front();
            queue.pop();

            if (isValid(str)) {
                result.push_back(str);
                found = true;
            }

            if (found) continue;

            int n = str.size();

            for (int i = 0; i < n; i++) {
                if (str[i] != '(' && str[i] != ')') continue;

                string t = str.substr(0, i) + str.substr(i + 1);

                if (!set.count(t)) {
                    queue.push(t);
                    set.insert(t);
                }
            }
        }

        return result;
    }

    bool isValid(string s) {
        int count = 0;
        int n = s.size();

        for (char& c : s) {
            if (c == '(') {
                count++;
            } else if (c == ')' && --count < 0) {
                return false;
            }
        }

        return count == 0;
    }
};