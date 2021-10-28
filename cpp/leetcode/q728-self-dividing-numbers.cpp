#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {
        vector<int> result;

        for (int i = left; i <= right; i++) {
            int num = i;

            while (num > 0) {
                int digit = num % 10;
                if (digit == 0 || i % digit != 0) break;
                num /= 10;
            }

            if (num == 0) result.push_back(i);
        }

        return result;
    }
};