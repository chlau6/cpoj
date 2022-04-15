#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minMutation(string start, string end, vector<string>& bank) {
        int result = 0;
        vector<char> choices = {'A', 'C', 'G', 'T'};
        unordered_set<string> set(bank.begin(), bank.end());
        queue<string> q;

        q.push(start);

        while (!q.empty()) {
            int n = q.size();

            for (int i = 0; i < n; i++) {
                string t = q.front();
                q.pop();

                if (t == end) return result;

                for (int j = 0; j < t.size(); j++) {
                    char oldChar = t[j];

                    for (char c : choices) {
                        t[j] = c;

                        if (set.count(t)) {
                            q.push(t);
                            set.erase(t);
                        }
                    }

                    t[j] = oldChar;
                }
            }

            result++;
        }

        return -1;
    }
};