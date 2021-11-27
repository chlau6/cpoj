#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        int result = 0;

        for (string op : operations) {
            result += (op[0] == '+' || op[2] == '+') ? 1 : -1;
        }

        return result;
    }
};