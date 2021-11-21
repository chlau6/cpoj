#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int totalMoney(int n) {
        int week = n / 7;
        int day = n % 7;

        return (56 + 7 * (week - 1)) * week / 2 + (2 * week + day + 1) * day / 2;
    }
};