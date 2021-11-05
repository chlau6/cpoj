#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> addToArrayForm(vector<int>& num, int k) {
        vector<int> result;
        int length = num.size();

        for (int i = length - 1; i >= 0; i--) {
            k += num[i];
            result.push_back(k % 10);
            k /= 10;
        }

        while (k > 0) {
            result.push_back(k % 10);
            k /= 10;
        }

        reverse(result.begin(), result.end());

        return result;
    }
};