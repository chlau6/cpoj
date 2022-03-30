#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int lengthLongestPath(string input) {
        unordered_map<int, int> map;
        int result = 0;
        map[0] = 0;

        istringstream iss(input);
        string line;

        while (getline(iss, line)) {
            int level = line.find_last_of('\t') + 1;
            int length = line.substr(level).size();

            if (line.find('.') != string::npos) {
                result = max(result, map[level] + length);
            } else {
                map[level + 1] = map[level] + length + 1;
            }
        }

        return result;
    }
};