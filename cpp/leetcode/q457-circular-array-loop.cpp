#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool circularArrayLoop(vector<int>& nums) {
        int n = nums.size();
        vector<bool> visited(n);

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            visited[i] = true;

            vector<bool> innerVisited(n);
            int curr = i;

            while (true) {
                int next = ((curr + nums[curr]) % n + n) % n;
                if (curr == next || nums[curr] * nums[next] < 0) break;

                if (innerVisited[next]) return true;

                innerVisited[next] = true;
                curr = next;
                visited[next] = true;
            }
        }

        return false;
    }
};