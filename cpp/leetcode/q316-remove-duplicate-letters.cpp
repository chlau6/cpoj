#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string removeDuplicateLetters(string s) {
        string result = "0";
        vector<int> counts(256);
        vector<bool> visited(256);

        for (char& c : s) {
            counts[c]++;
        }

        for (char& c : s) {
            counts[c]--;

            if (visited[c]) continue;

            while (c < result.back() && counts[result.back()] > 0) {
                visited[result.back()] = false;
                result.pop_back();
            }

            result.push_back(c);
            visited[c] = true;
        }

        return result.substr(1);
    }
};