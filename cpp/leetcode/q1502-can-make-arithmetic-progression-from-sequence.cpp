#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool canMakeArithmeticProgression(vector<int>& arr) {
        int length = arr.size();

        sort(arr.begin(), arr.end());

        for (int i = 2; i < length; i++) {
            if (arr[i] - arr[i - 1] != arr[i - 1] - arr[i - 2]) return false;
        }

        return true;
    }
};