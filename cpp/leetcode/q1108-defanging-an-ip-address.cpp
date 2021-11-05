#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string defangIPaddr(string address) {
        string result;

        for (auto c : address) {
            if (c == '.') {
                result += "[.]";
            } else {
                result += c;
            }
        }

        return result;
    }
};