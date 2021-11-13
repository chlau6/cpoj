#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool canBeEqual(vector<int>& target, vector<int>& arr) {
        vector<int> counts(1001);

        for (int num : target) {
            counts[num]++;
        }

        for (int num : arr) {
            counts[num]--;
        }

        for (int count : counts) {
            if (count > 0) return false;
        }

        return true;
    }
};