#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> sortByBits(vector<int>& arr) {
        for (auto& num : arr) {
            num = countBit(num) * 10001 + num;
        }

        sort(arr.begin(), arr.end());

        for (auto& num : arr) {
            num %= 10001;
        }

        return arr;
    }

    int countBit(int num) {
        int count = 0;

        while (num != 0) {
            count += (num & 1);
            num >>= 1;
        }

        return count;
    }
};