#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findPoisonedDuration(vector<int>& timeSeries, int duration) {
        int count = 0;
        int length = timeSeries.size();

        for (int i = 1; i < length; i++) {
            int diff = timeSeries[i] - timeSeries[i - 1];
            count += (diff < duration) ? diff : duration;
        }

        return count + duration;
    }
};