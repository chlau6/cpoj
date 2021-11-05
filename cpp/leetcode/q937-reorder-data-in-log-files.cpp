#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> reorderLogFiles(vector<string>& logs) {
        vector<string> result;
        vector<string> digitLogs;
        vector<vector<string>> letterLogs;

        for (string log : logs) {
            auto pos = log.find(" ");

            if (log[pos + 1] <= '9') {
                digitLogs.push_back(log);
                continue;
            }

            letterLogs.push_back({log.substr(0, pos), log.substr(pos + 1)});
        }

        sort(letterLogs.begin(), letterLogs.end(), [](vector<string>& a, vector<string>& b) {
            return a[1] < b[1] || (a[1] == b[1] && a[0] < b[0]);
        });

        for (auto& v : letterLogs) {
            result.push_back(v[0] + " " + v[1]);
        }

        for (string log : digitLogs) {
            result.push_back(log);
        }

        return result;
    }
};