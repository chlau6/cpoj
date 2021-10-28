#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int calPoints(vector<string>& ops) {
        vector<int> v;

        for (auto op : ops) {
            if (op == "C") {
                v.pop_back();
            } else if (op == "D") {
                v.push_back(v.back() * 2);
            } else if (op == "+") {
                v.push_back(v.back() + v[v.size() - 2]);
            } else {
                v.push_back(stoi(op));
            }
        }

        return accumulate(v.begin(), v.end(), 0);
    }
};