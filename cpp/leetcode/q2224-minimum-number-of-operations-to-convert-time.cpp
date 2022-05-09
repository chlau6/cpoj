#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int convertTime(string current, string correct) {
        int result = 0;
        vector<int> ops = {60, 15, 5, 1};

        int diff = abs(convert(current) - convert(correct));

        for (int op : ops) {
            result += diff / op;
            diff %= op;
        }

        return result;
    }

    int convert(string current) {
        return stoi(current.substr(0, 2)) * 60 + stoi(current.substr(3));
    }
};