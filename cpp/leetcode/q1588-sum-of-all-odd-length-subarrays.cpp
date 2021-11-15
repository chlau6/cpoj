#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int sumOddLengthSubarrays(vector<int>& arr) {
        int sum = 0;
        int length = arr.size();

        for (int i = 0; i < length; i++) {
            sum += ((i + 1) * (length - i) + 1) / 2 * arr[i];
        }

        return sum;
    }
};