#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countEven(int num) {
        int n = num;
        int digitSum = 0;

        while (num > 0) {
            digitSum += num % 10;
            num /= 10;
        }

        return (n - digitSum % 2) / 2;
    }
};