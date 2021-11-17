#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> decrypt(vector<int>& code, int k) {
        int n = code.size();
        vector<int> result(n);

        if (k == 0) return result;

        int start = 1;
        int end = k;
        int sum = 0;

        if (k < 1) {
            k = -k;
            start = n - k;
            end = n - 1;
        }

        for (int i = start; i <= end; i++) {
            sum += code[i];
        }

        for (int i = 0; i < n; i++) {
            result[i] = sum;

            sum -= code[start++ % n];
            sum += code[++end % n];
        }

        return result;
    }
};