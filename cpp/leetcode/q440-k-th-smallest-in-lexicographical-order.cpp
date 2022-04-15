#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findKthNumber(int n, int k) {
        int curr = 1;
        k--;

        while (k > 0) {
            long step = 0;
            long first = curr;
            long last = curr + 1;

            while (first <= n) {
                step += min((long) n + 1, last) - first;
                first *= 10;
                last *= 10;
            }

            if (step <= k) {
                k -= step;
                curr++;
            } else {
                k--;
                curr *= 10;
            }
        }

        return curr;
    }
};