#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int tribonacci(int n) {
        if (n < 2) return n;

        int zeroth = 0;
        int first = 1;
        int second = 1;

        for (int i = 3; i <= n; i++) {
            int temp = zeroth + first + second;
            zeroth = first;
            first = second;
            second = temp;
        }

        return second;
    }
};