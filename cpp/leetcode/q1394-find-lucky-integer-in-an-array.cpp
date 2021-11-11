#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findLucky(vector<int>& arr) {
        vector<int> counts(501);

        for (int num : arr) {
            counts[num]++;
        }

        for (int i = 500; i >= 1; i--) {
            if (counts[i] == i) return i;
        }

        return -1;
    }
};