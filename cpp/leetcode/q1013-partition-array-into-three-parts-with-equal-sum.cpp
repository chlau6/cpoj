#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool canThreePartsEqualSum(vector<int>& arr) {
        int sum = accumulate(arr.begin(), arr.end(), 0);

        if (sum % 3 != 0) return false;

        int average = sum / 3;
        int count = 0;
        int temp = 0;

        for (int num : arr) {
            temp += num;

            if (temp == average) {
                count++;
                temp = 0;
            }
        }

        return count >= 3;
    }
};