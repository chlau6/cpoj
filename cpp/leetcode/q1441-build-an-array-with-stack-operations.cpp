#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> buildArray(vector<int>& target, int n) {
        vector<string> result;
        int length = target.size();

        int j = 1;

        for (int num : target) {
            while (num != j) {
                result.push_back("Push");
                result.push_back("Pop");
                j++;
            }

            result.push_back("Push");
            j++;
        }

        return result;
    }
};