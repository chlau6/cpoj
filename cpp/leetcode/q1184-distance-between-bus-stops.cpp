#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int distanceBetweenBusStops(vector<int>& distance, int start, int destination) {
        if (start > destination) {
            swap(start, destination);
        }

        int total = 0;
        int clockwise = 0;
        int length = distance.size();

        for (int i = 0; i < length; i++) {
            if (i >= start && i < destination) {
                clockwise += distance[i];
            }

            total += distance[i];
        }

        return min(clockwise, total - clockwise);
    }
};