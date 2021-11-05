#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> findOcurrences(string text, string first, string second) {
        vector<string> result;

        string token;
        string prev1;
        string prev2;
        istringstream iss(text);

        while (iss >> token) {
            if (prev2 == first && prev1 == second) {
                result.push_back(token);
            }

            prev2 = prev1;
            prev1 = token;
        }

        return result;
    }
};