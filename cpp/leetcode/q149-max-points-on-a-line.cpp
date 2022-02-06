#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxPoints(vector<vector<int>>& points) {
        int n = points.size();
        int result = INT_MIN;

        for (int i = 0; i < n; i++) {
            int duplicate = 1;
            unordered_map<string, int> map;

            for (int j = i + 1; j < n; j++) {
                if (points[i][0] == points[j][0] && points[i][1] == points[j][1]) {
                    duplicate++;
                    continue;
                }

                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                int gcdResult = gcd(dx, dy);
                string key = to_string(dx / gcdResult) + " " +  to_string(dy / gcdResult);

                ++map[key];
            }

            result = max(result, duplicate);

            for (auto it = map.begin(); it != map.end(); it++) {
                result = max(result, it->second + duplicate);
            }
        }

        return result;
    }

    int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
};