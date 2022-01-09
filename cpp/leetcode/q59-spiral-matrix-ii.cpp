#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> result(n, vector<int>(n));

        int top = 0;
        int bot = n - 1;
        int left = 0;
        int right = n - 1;
        int count = 1;
        int total = n * n;

        while (count <= total) {
            for (int i = left; i <= right; i++) {
                result[top][i] = count++;
            }
            top++;

            for (int i = top; i <= bot; i++) {
                result[i][right] = count++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                result[bot][i] = count++;
            }
            bot--;

            for (int i = bot; i >= top; i--) {
                result[i][left] = count++;
            }
            left++;
        }

        return result;
    }
};