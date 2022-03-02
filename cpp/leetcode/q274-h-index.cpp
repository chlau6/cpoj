#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int hIndex(vector<int>& citations) {
        int n = citations.size();
        vector<int> bucket(n + 1);
        int count = 0;

        for (int citation : citations) {
            if (citation >= n) {
                bucket[n]++;
            } else {
                bucket[citation]++;
            }
        }

        for (int i = n; i >= 0; i--) {
            count += bucket[i];

            if (count >= i) {
                return i;
            }
        }

        return -1;
    }
};