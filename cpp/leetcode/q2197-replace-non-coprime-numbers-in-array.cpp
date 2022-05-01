#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> replaceNonCoprimes(vector<int>& nums) {
        vector<int> result;

        for (int num : nums) {
            while (true) {
                int last = result.empty() ? 1 : result.back();
                int x = gcd(last, num);

                if (x == 1) break;
                num *= last / x;
                result.pop_back();
            }

            result.push_back(num);
        }

        return result;
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
};