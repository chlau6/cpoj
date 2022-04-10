#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findNthDigit(int n) {
        long count = 9;
        int start = 1;
        int length = 1;

        while (length * count < n) {
            n -= length * count;
            length++;

            count *= 10;
            start *= 10;
        }

        start += (n - 1) / length;
        string s = to_string(start);

        return s[(n - 1) % length] - '0';
    }
};