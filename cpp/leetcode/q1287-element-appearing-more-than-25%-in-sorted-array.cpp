#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findSpecialInteger(vector<int>& arr) {
        int length = arr.size();
        int target = length / 4;

        for (int i = 0; i < length - target; i++) {
            if (arr[i] == arr[i + target]) return arr[i];
        }

        return -1;
    }
};