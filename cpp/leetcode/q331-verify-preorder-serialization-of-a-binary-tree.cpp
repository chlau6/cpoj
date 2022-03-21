#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isValidSerialization(string preorder) {
        int diff = 1;
        istringstream iss(preorder);
        string token;

        while (getline(iss, token, ',')) {
            if (--diff < 0) {
                return false;
            } else if (token != "#") {
                diff += 2;
            }
        }

        return diff == 0;
    }
};