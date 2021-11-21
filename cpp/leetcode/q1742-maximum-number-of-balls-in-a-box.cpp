#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countBalls(int lowLimit, int highLimit) {
        vector<int> counts(46);

        for (int i = lowLimit; i <= highLimit; i++) {
            int digitSum = 0;
            int num = i;

            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }

            counts[digitSum]++;
        }

        int result = 0;

        for (int count : counts) {
            result = max(result, count);
        }

        return result;
    }
};