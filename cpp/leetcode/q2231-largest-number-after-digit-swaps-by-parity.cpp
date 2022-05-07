#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int largestInteger(int num) {
        priority_queue<int> odd;
        priority_queue<int> even;

        string str = to_string(num);
        int n = str.size();

        for (int i = 0; i < n; i++) {
            int digit = str[i] - '0';

            if (digit % 2 == 0) {
                even.push(digit);
            } else {
                odd.push(digit);
            }
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            result *= 10;
            int digit = str[i] - '0';

            if (digit % 2 == 0) {
                result += even.top();
                even.pop();
            } else {
                result += odd.top();
                odd.pop();
            }
        }

        return result;
    }
};