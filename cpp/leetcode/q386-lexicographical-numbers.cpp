#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> lexicalOrder(int n) {
        vector<int> result;

        for (int i = 1; i <= 9; i++) {
            dfs(result, i, n);
        }

        return result;
    }

    void dfs(vector<int>& result, int num, int n) {
        if (num > n) return;

        result.push_back(num);

        for (int i = 0; i <= 9; i++) {
            int t = num * 10 + i;

            if (t > n) return;
            dfs(result, t, n);
        }
    }
};