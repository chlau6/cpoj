#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool hasGroupsSizeX(vector<int>& deck) {
        unordered_map<int, int> map;
        int result = 0;

        for (int d : deck) {
            ++map[d];
        }

        for (auto count : map) {
            result = gcd(count.second, result);
        }

        return result > 1;
    }

    int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
};