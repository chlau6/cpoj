#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string smallestGoodBase(string n) {
        long num = stol(n);
        int start = log(num + 1) / log(2);

        for (int i = start; i >= 2; i--) {
            long left = 2;
            long right = pow(num, 1.0 / (i - 1)) + 1;

            while (left < right) {
                long mid = left + (right - left) / 2;
                long sum = 0;

                for (int j = 0; j < i; j++) {
                    sum = sum * mid + 1;
                }

                if (sum == num) return to_string(mid);
                else if (sum < num) left = mid + 1;
                else right = mid;
            }
        }

        return to_string(num - 1);
    }
};