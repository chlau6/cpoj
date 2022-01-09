#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string getPermutation(int n, int k) {
        string nums = "123456789";
        string result;

        vector<int> fib(n);
        fib[0] = 1;

        for (int i = 1; i < n; i++) {
            fib[i] = fib[i - 1] * i;
        }

        k--;

        for (int i = n; i >= 1; i--) {
            int j = k / fib[i - 1];
            k %= fib[i - 1];

            result += nums[j];
            nums.erase(j, 1);
        }

        return result;
    }
};