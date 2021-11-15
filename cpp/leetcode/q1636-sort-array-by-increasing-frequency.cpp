#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    char slowestKey(vector<int>& releaseTimes, string keysPressed) {
        int n = releaseTimes.size();
        int longest = releaseTimes[0];
        char result = keysPressed[0];

        for (int i = 1; i < n; i++) {
            int duration = releaseTimes[i] - releaseTimes[i - 1];

            if (duration > longest || duration == longest && keysPressed[i] > result) {
                longest = duration;
                result = keysPressed[i];
            }
        }

        return result;
    }
};